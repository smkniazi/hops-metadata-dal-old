package se.sics.hop.metadata.persistence.entity.hop.var;

import se.sics.hop.metadata.persistence.FinderType;
import java.util.EnumMap;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public abstract class HopVariable {

  public final static EnumMap<Finder, byte[]> defaultValues = new EnumMap(Finder.class);

  public static void registerVariableDefaultValue(Finder variable, byte[] defaultValue) {
    defaultValues.put(variable, defaultValue);
  }

  public static enum Finder implements FinderType<HopVariable> {
    //Named Variables
    GenerationStamp,
    BlockID,
    INodeID,
    ReplicationIndex,
    StorageInfo,
    
    //Generic Variables
    GenericInteger,
    GenericLong,
    GenericString,
    GenericByteArray,
    GenericArray;

    public int getId() {
      return this.ordinal();
    }

    public byte[] getDefaultValue() {
      return defaultValues.get(this);
    }

    public static Finder getFinder(int varType) {
      if (varType >= Finder.values().length) {
        throw new IllegalArgumentException("Variable Type " + varType + " doesn't exist");
      }
      return Finder.values()[varType];
    }

    @Override
    public Class getType() {
      return HopVariable.class;
    }
  }
  private final Finder type;

  public HopVariable(Finder type) {
    this.type = type;
  }

  public abstract void setValue(byte[] val);

  public abstract byte[] getBytes();

  public abstract Object getValue();

  public abstract int getLength();

  public Finder getType() {
    return type;
  }

  public static HopVariable getVariable(byte varType) {
    Finder type = Finder.getFinder(varType);
    return getVariable(type);
  }

  public static HopVariable getVariable(Finder varType) {
    switch (varType) {

      case GenericInteger:
        return new HopIntVariable(varType);
      case GenericLong:
        return new HopLongVariable(varType);
      case GenericString:
        return new HopStringVariable(varType);
      case GenericByteArray:
        return new HopByteArrayVariable(varType);
      case GenericArray:
        return new HopArrayVariable(varType);

      case GenerationStamp:
        return new HopLongVariable(varType);
      case BlockID:
        return new HopLongVariable(varType);
      case INodeID:
        return new HopLongVariable(varType);
      case ReplicationIndex:
        return new HopArrayVariable(varType);
      case StorageInfo:
        return new HopArrayVariable(varType);
    }
    return null;
  }

  public static HopVariable initVariable(Finder varType, byte[] varData) {
    HopVariable var = getVariable(varType);
    if (var != null) {
      var.setValue(varData);
    }
    return var;
  }
}
