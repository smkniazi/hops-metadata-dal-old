/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * @author Nikos Stanogias <niksta@sics.se>
 */
public interface ResourceRequestTableDef {
    public static final String TABLE_NAME = "ha_resourcerequest";
    public static final String APPSCHEDULINGINFO_ID = "appschedulinginfo_id";
    public static final String PRIORITY = "priority";
    public static final String NAME = "name";
    public static final String RESOURCEREQUESTSTATE = "resourcerequeststate";
}