package cn.rongcloud.im.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/**
 * DAO for table GROUP_MEMBER.
*/
public class GroupMemberDao extends AbstractDao<GroupMember, Void> {

    public static final String TABLENAME = "GROUP_MEMBER";

    /**
     * Properties of entity GroupMember.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property GroupId = new Property(0, String.class, "groupId", false, "GROUP_ID");
        public final static Property UserId = new Property(1, String.class, "userId", false, "USER_ID");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property PortraitUri = new Property(3, String.class, "portraitUri", false, "PORTRAIT_URI");
        public final static Property DisplayName = new Property(4, String.class, "displayName", false, "DISPLAY_NAME");
    };


    public GroupMemberDao(DaoConfig config) {
        super(config);
    }

    public GroupMemberDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "'GROUP_MEMBER' (" + //
                   "'GROUP_ID' TEXT NOT NULL ," + // 0: groupId
                   "'USER_ID' TEXT NOT NULL ," + // 1: userId
                   "'NAME' TEXT," + // 2: name
                   "'PORTRAIT_URI' TEXT," + // 3: portraitUri
                   "'DISPLAY_NAME' TEXT);"); // 4: displayName
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'GROUP_MEMBER'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, GroupMember entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getGroupId());
        stmt.bindString(2, entity.getUserId());

        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }

        String portraitUri = entity.getPortraitUri();
        if (portraitUri != null) {
            stmt.bindString(4, portraitUri);
        }

        String displayName = entity.getDisplayName();
        if (displayName != null) {
            stmt.bindString(5, displayName);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }

    /** @inheritdoc */
    @Override
    public GroupMember readEntity(Cursor cursor, int offset) {
        GroupMember entity = new GroupMember( //
            cursor.getString(offset + 0), // groupId
            cursor.getString(offset + 1), // userId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // portraitUri
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // displayName
        );
        return entity;
    }

    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, GroupMember entity, int offset) {
        entity.setGroupId(cursor.getString(offset + 0));
        entity.setUserId(cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPortraitUri(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDisplayName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
    }

    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(GroupMember entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }

    /** @inheritdoc */
    @Override
    public Void getKey(GroupMember entity) {
        return null;
    }

    /** @inheritdoc */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

}
