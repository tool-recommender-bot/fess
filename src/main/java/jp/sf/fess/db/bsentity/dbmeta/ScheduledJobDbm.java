/*
 * Copyright 2009-2013 the Fess Project and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package jp.sf.fess.db.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import jp.sf.fess.db.allcommon.DBCurrent;
import jp.sf.fess.db.allcommon.DBFluteConfig;
import jp.sf.fess.db.exentity.ScheduledJob;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.dbmeta.info.UniqueInfo;
import org.seasar.dbflute.dbmeta.name.TableSqlName;

/**
 * The DB meta of SCHEDULED_JOB. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ScheduledJobDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ScheduledJobDbm _instance = new ScheduledJobDbm();

    private ScheduledJobDbm() {
    }

    public static ScheduledJobDbm getInstance() {
        return _instance;
    }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    @Override
    public DBDef getCurrentDBDef() {
        return DBCurrent.getInstance().currentDBDef();
    }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgId(), "id");
        setupEpg(_epgMap, new EpgName(), "name");
        setupEpg(_epgMap, new EpgTarget(), "target");
        setupEpg(_epgMap, new EpgCronExpression(), "cronExpression");
        setupEpg(_epgMap, new EpgScriptType(), "scriptType");
        setupEpg(_epgMap, new EpgScriptData(), "scriptData");
        setupEpg(_epgMap, new EpgCrawler(), "crawler");
        setupEpg(_epgMap, new EpgJobLogging(), "jobLogging");
        setupEpg(_epgMap, new EpgSortOrder(), "sortOrder");
        setupEpg(_epgMap, new EpgCreatedBy(), "createdBy");
        setupEpg(_epgMap, new EpgCreatedTime(), "createdTime");
        setupEpg(_epgMap, new EpgUpdatedBy(), "updatedBy");
        setupEpg(_epgMap, new EpgUpdatedTime(), "updatedTime");
        setupEpg(_epgMap, new EpgDeletedBy(), "deletedBy");
        setupEpg(_epgMap, new EpgDeletedTime(), "deletedTime");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }

    @Override
    public PropertyGateway findPropertyGateway(final String propertyName) {
        return doFindEpg(_epgMap, propertyName);
    }

    public static class EpgId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setId(ctl(v));
        }
    }

    public static class EpgName implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getName();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setName((String) v);
        }
    }

    public static class EpgTarget implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getTarget();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setTarget((String) v);
        }
    }

    public static class EpgCronExpression implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getCronExpression();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setCronExpression((String) v);
        }
    }

    public static class EpgScriptType implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getScriptType();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setScriptType((String) v);
        }
    }

    public static class EpgScriptData implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getScriptData();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setScriptData((String) v);
        }
    }

    public static class EpgCrawler implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getCrawler();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setCrawler((String) v);
        }
    }

    public static class EpgJobLogging implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getJobLogging();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setJobLogging((String) v);
        }
    }

    public static class EpgSortOrder implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getSortOrder();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setSortOrder(cti(v));
        }
    }

    public static class EpgCreatedBy implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getCreatedBy();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setCreatedBy((String) v);
        }
    }

    public static class EpgCreatedTime implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getCreatedTime();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setCreatedTime((java.sql.Timestamp) v);
        }
    }

    public static class EpgUpdatedBy implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getUpdatedBy();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setUpdatedBy((String) v);
        }
    }

    public static class EpgUpdatedTime implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getUpdatedTime();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setUpdatedTime((java.sql.Timestamp) v);
        }
    }

    public static class EpgDeletedBy implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getDeletedBy();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setDeletedBy((String) v);
        }
    }

    public static class EpgDeletedTime implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getDeletedTime();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setDeletedTime((java.sql.Timestamp) v);
        }
    }

    public static class EpgVersionNo implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ScheduledJob) e).getVersionNo();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ScheduledJob) e).setVersionNo(cti(v));
        }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SCHEDULED_JOB";

    protected final String _tablePropertyName = "scheduledJob";

    protected final TableSqlName _tableSqlName = new TableSqlName(
            "SCHEDULED_JOB", _tableDbName);
    {
        _tableSqlName.xacceptFilter(DBFluteConfig.getInstance()
                .getTableSqlNameFilter());
    }

    @Override
    public String getTableDbName() {
        return _tableDbName;
    }

    @Override
    public String getTablePropertyName() {
        return _tablePropertyName;
    }

    @Override
    public TableSqlName getTableSqlName() {
        return _tableSqlName;
    }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci(
            "ID",
            "ID",
            null,
            null,
            true,
            "id",
            Long.class,
            true,
            true,
            "BIGINT",
            19,
            0,
            "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_D6F9129E_73D7_4058_B2B1_ABC852F6C6F9",
            false, null, null, null, null, null);

    protected final ColumnInfo _columnName = cci("NAME", "NAME", null, null,
            true, "name", String.class, false, false, "VARCHAR", 100, 0, null,
            false, null, null, null, null, null);

    protected final ColumnInfo _columnTarget = cci("TARGET", "TARGET", null,
            null, true, "target", String.class, false, false, "VARCHAR", 100,
            0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnCronExpression = cci("CRON_EXPRESSION",
            "CRON_EXPRESSION", null, null, true, "cronExpression",
            String.class, false, false, "VARCHAR", 100, 0, null, false, null,
            null, null, null, null);

    protected final ColumnInfo _columnScriptType = cci("SCRIPT_TYPE",
            "SCRIPT_TYPE", null, null, true, "scriptType", String.class, false,
            false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnScriptData = cci("SCRIPT_DATA",
            "SCRIPT_DATA", null, null, false, "scriptData", String.class,
            false, false, "VARCHAR", 4000, 0, null, false, null, null, null,
            null, null);

    protected final ColumnInfo _columnCrawler = cci("CRAWLER", "CRAWLER", null,
            null, true, "crawler", String.class, false, false, "VARCHAR", 1, 0,
            null, false, null, null, null, null, null);

    protected final ColumnInfo _columnJobLogging = cci("JOB_LOGGING",
            "JOB_LOGGING", null, null, true, "jobLogging", String.class, false,
            false, "VARCHAR", 1, 0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnSortOrder = cci("SORT_ORDER",
            "SORT_ORDER", null, null, true, "sortOrder", Integer.class, false,
            false, "INTEGER", 10, 0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnCreatedBy = cci("CREATED_BY",
            "CREATED_BY", null, null, true, "createdBy", String.class, false,
            false, "VARCHAR", 255, 0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnCreatedTime = cci("CREATED_TIME",
            "CREATED_TIME", null, null, true, "createdTime",
            java.sql.Timestamp.class, false, false, "TIMESTAMP", 23, 10, null,
            false, null, null, null, null, null);

    protected final ColumnInfo _columnUpdatedBy = cci("UPDATED_BY",
            "UPDATED_BY", null, null, false, "updatedBy", String.class, false,
            false, "VARCHAR", 255, 0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnUpdatedTime = cci("UPDATED_TIME",
            "UPDATED_TIME", null, null, false, "updatedTime",
            java.sql.Timestamp.class, false, false, "TIMESTAMP", 23, 10, null,
            false, null, null, null, null, null);

    protected final ColumnInfo _columnDeletedBy = cci("DELETED_BY",
            "DELETED_BY", null, null, false, "deletedBy", String.class, false,
            false, "VARCHAR", 255, 0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnDeletedTime = cci("DELETED_TIME",
            "DELETED_TIME", null, null, false, "deletedTime",
            java.sql.Timestamp.class, false, false, "TIMESTAMP", 23, 10, null,
            false, null, null, null, null, null);

    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO",
            "VERSION_NO", null, null, true, "versionNo", Integer.class, false,
            false, "INTEGER", 10, 0, null, false,
            OptimisticLockType.VERSION_NO, null, null, null, null);

    public ColumnInfo columnId() {
        return _columnId;
    }

    public ColumnInfo columnName() {
        return _columnName;
    }

    public ColumnInfo columnTarget() {
        return _columnTarget;
    }

    public ColumnInfo columnCronExpression() {
        return _columnCronExpression;
    }

    public ColumnInfo columnScriptType() {
        return _columnScriptType;
    }

    public ColumnInfo columnScriptData() {
        return _columnScriptData;
    }

    public ColumnInfo columnCrawler() {
        return _columnCrawler;
    }

    public ColumnInfo columnJobLogging() {
        return _columnJobLogging;
    }

    public ColumnInfo columnSortOrder() {
        return _columnSortOrder;
    }

    public ColumnInfo columnCreatedBy() {
        return _columnCreatedBy;
    }

    public ColumnInfo columnCreatedTime() {
        return _columnCreatedTime;
    }

    public ColumnInfo columnUpdatedBy() {
        return _columnUpdatedBy;
    }

    public ColumnInfo columnUpdatedTime() {
        return _columnUpdatedTime;
    }

    public ColumnInfo columnDeletedBy() {
        return _columnDeletedBy;
    }

    public ColumnInfo columnDeletedTime() {
        return _columnDeletedTime;
    }

    public ColumnInfo columnVersionNo() {
        return _columnVersionNo;
    }

    @Override
    protected List<ColumnInfo> ccil() {
        final List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnName());
        ls.add(columnTarget());
        ls.add(columnCronExpression());
        ls.add(columnScriptType());
        ls.add(columnScriptData());
        ls.add(columnCrawler());
        ls.add(columnJobLogging());
        ls.add(columnSortOrder());
        ls.add(columnCreatedBy());
        ls.add(columnCreatedTime());
        ls.add(columnUpdatedBy());
        ls.add(columnUpdatedTime());
        ls.add(columnDeletedBy());
        ls.add(columnDeletedTime());
        ls.add(columnVersionNo());
        return ls;
    }

    {
        initializeInformationResource();
    }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    @Override
    protected UniqueInfo cpui() {
        return hpcpui(columnId());
    }

    @Override
    public boolean hasPrimaryKey() {
        return true;
    }

    @Override
    public boolean hasCompoundPrimaryKey() {
        return false;
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    @Override
    public boolean hasIdentity() {
        return true;
    }

    @Override
    public boolean hasVersionNo() {
        return true;
    }

    @Override
    public ColumnInfo getVersionNoColumnInfo() {
        return _columnVersionNo;
    }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    @Override
    public String getEntityTypeName() {
        return "jp.sf.fess.db.exentity.ScheduledJob";
    }

    @Override
    public String getConditionBeanTypeName() {
        return "jp.sf.fess.db.cbean.ScheduledJobCB";
    }

    @Override
    public String getBehaviorTypeName() {
        return "jp.sf.fess.db.exbhv.ScheduledJobBhv";
    }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    @Override
    public Class<ScheduledJob> getEntityType() {
        return ScheduledJob.class;
    }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    @Override
    public Entity newEntity() {
        return newMyEntity();
    }

    public ScheduledJob newMyEntity() {
        return new ScheduledJob();
    }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    @Override
    public void acceptPrimaryKeyMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptPrimaryKeyMap((ScheduledJob) e, m);
    }

    @Override
    public void acceptAllColumnMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptAllColumnMap((ScheduledJob) e, m);
    }

    @Override
    public Map<String, Object> extractPrimaryKeyMap(final Entity e) {
        return doExtractPrimaryKeyMap(e);
    }

    @Override
    public Map<String, Object> extractAllColumnMap(final Entity e) {
        return doExtractAllColumnMap(e);
    }
}
