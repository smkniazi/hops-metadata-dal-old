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
public interface FiCaSchedulerAppLiveContainersTableDef {
    public static final String TABLE_NAME = "ha_ficaschedulerapp_livecontainers";
    public static final String FICASCHEDULERAPP_ID = "ficaschedulerapp_id";
    public static final String CONTAINERID_ID = "containerid_id";
    public static final String RMCONTAINER_ID = "rmcontainer_id";
}