// This class was generated from android.androidVNC.IConnectionBean by a tool
// Do not edit this file directly! PLX THX
package android.androidVNC;

public abstract class AbstractConnectionBean extends com.antlersoft.android.dbimpl.IdImplementationBase implements IConnectionBean {

    public static final String GEN_TABLE_NAME = "CONNECTION_BEAN";
    public static final int GEN_COUNT = 21;

    // Field constants
    public static final String GEN_FIELD__ID = "_id";
    public static final int GEN_ID__ID = 0;
    public static final String GEN_FIELD_NICKNAME = "NICKNAME";
    public static final int GEN_ID_NICKNAME = 1;
    public static final String GEN_FIELD_ADDRESS = "ADDRESS";
    public static final int GEN_ID_ADDRESS = 2;
    public static final String GEN_FIELD_PORT = "PORT";
    public static final int GEN_ID_PORT = 3;
    public static final String GEN_FIELD_PASSWORD = "PASSWORD";
    public static final int GEN_ID_PASSWORD = 4;
    public static final String GEN_FIELD_COLORMODEL = "COLORMODEL";
    public static final int GEN_ID_COLORMODEL = 5;
    public static final String GEN_FIELD_FORCEFULL = "FORCEFULL";
    public static final int GEN_ID_FORCEFULL = 6;
    public static final String GEN_FIELD_REPEATERID = "REPEATERID";
    public static final int GEN_ID_REPEATERID = 7;
    public static final String GEN_FIELD_INPUTMODE = "INPUTMODE";
    public static final int GEN_ID_INPUTMODE = 8;
    public static final String GEN_FIELD_SCALEMODE = "SCALEMODE";
    public static final int GEN_ID_SCALEMODE = 9;
    public static final String GEN_FIELD_USELOCALCURSOR = "USELOCALCURSOR";
    public static final int GEN_ID_USELOCALCURSOR = 10;
    public static final String GEN_FIELD_KEEPPASSWORD = "KEEPPASSWORD";
    public static final int GEN_ID_KEEPPASSWORD = 11;
    public static final String GEN_FIELD_FOLLOWMOUSE = "FOLLOWMOUSE";
    public static final int GEN_ID_FOLLOWMOUSE = 12;
    public static final String GEN_FIELD_USEREPEATER = "USEREPEATER";
    public static final int GEN_ID_USEREPEATER = 13;
    public static final String GEN_FIELD_METALISTID = "METALISTID";
    public static final int GEN_ID_METALISTID = 14;
    public static final String GEN_FIELD_LAST_META_KEY_ID = "LAST_META_KEY_ID";
    public static final int GEN_ID_LAST_META_KEY_ID = 15;
    public static final String GEN_FIELD_FOLLOWPAN = "FOLLOWPAN";
    public static final int GEN_ID_FOLLOWPAN = 16;
    public static final String GEN_FIELD_USERNAME = "USERNAME";
    public static final int GEN_ID_USERNAME = 17;
    public static final String GEN_FIELD_SECURECONNECTIONTYPE = "SECURECONNECTIONTYPE";
    public static final int GEN_ID_SECURECONNECTIONTYPE = 18;
    public static final String GEN_FIELD_SHOWZOOMBUTTONS = "SHOWZOOMBUTTONS";
    public static final int GEN_ID_SHOWZOOMBUTTONS = 19;
    public static final String GEN_FIELD_DOUBLE_TAP_ACTION = "DOUBLE_TAP_ACTION";
    public static final int GEN_ID_DOUBLE_TAP_ACTION = 20;

    // SQL Command for creating the table
    public static String GEN_CREATE = "CREATE TABLE CONNECTION_BEAN (" +
    "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
    "NICKNAME TEXT," +
    "ADDRESS TEXT," +
    "PORT INTEGER," +
    "PASSWORD TEXT," +
    "COLORMODEL TEXT," +
    "FORCEFULL INTEGER," +
    "REPEATERID TEXT," +
    "INPUTMODE TEXT," +
    "SCALEMODE TEXT," +
    "USELOCALCURSOR INTEGER," +
    "KEEPPASSWORD INTEGER," +
    "FOLLOWMOUSE INTEGER," +
    "USEREPEATER INTEGER," +
    "METALISTID INTEGER," +
    "LAST_META_KEY_ID INTEGER," +
    "FOLLOWPAN INTEGER DEFAULT 0," +
    "USERNAME TEXT," +
    "SECURECONNECTIONTYPE TEXT," +
    "SHOWZOOMBUTTONS INTEGER DEFAULT 1," +
    "DOUBLE_TAP_ACTION TEXT" +
    ")";

    // Members corresponding to defined fields
    private long gen__Id;
    private String gen_nickname;
    private String gen_address;
    private int gen_port;
    private String gen_password;
    private String gen_colorModel;
    private long gen_forceFull;
    private String gen_repeaterId;
    private String gen_inputMode;
    private String gen_SCALEMODE;
    private boolean gen_useLocalCursor;
    private boolean gen_keepPassword;
    private boolean gen_followMouse;
    private boolean gen_useRepeater;
    private long gen_metaListId;
    private long gen_LAST_META_KEY_ID;
    private boolean gen_followPan;
    private String gen_userName;
    private String gen_secureConnectionType;
    private boolean gen_showZoomButtons;
    private String gen_DOUBLE_TAP_ACTION;


    public String Gen_tableName() { return GEN_TABLE_NAME; }

    // Field accessors
    public long get_Id() { return gen__Id; }
    public void set_Id(long arg__Id) { gen__Id = arg__Id; }
    public String getNickname() { return gen_nickname; }
    public void setNickname(String arg_nickname) { gen_nickname = arg_nickname; }
    public String getAddress() { return gen_address; }
    public void setAddress(String arg_address) { gen_address = arg_address; }
    public int getPort() { return gen_port; }
    public void setPort(int arg_port) { gen_port = arg_port; }
    public String getPassword() { return gen_password; }
    public void setPassword(String arg_password) { gen_password = arg_password; }
    public String getColorModel() { return gen_colorModel; }
    public void setColorModel(String arg_colorModel) { gen_colorModel = arg_colorModel; }
    public long getForceFull() { return gen_forceFull; }
    public void setForceFull(long arg_forceFull) { gen_forceFull = arg_forceFull; }
    public String getRepeaterId() { return gen_repeaterId; }
    public void setRepeaterId(String arg_repeaterId) { gen_repeaterId = arg_repeaterId; }
    public String getInputMode() { return gen_inputMode; }
    public void setInputMode(String arg_inputMode) { gen_inputMode = arg_inputMode; }
    public String getScaleModeAsString() { return gen_SCALEMODE; }
    public void setScaleModeAsString(String arg_SCALEMODE) { gen_SCALEMODE = arg_SCALEMODE; }
    public boolean getUseLocalCursor() { return gen_useLocalCursor; }
    public void setUseLocalCursor(boolean arg_useLocalCursor) { gen_useLocalCursor = arg_useLocalCursor; }
    public boolean getKeepPassword() { return gen_keepPassword; }
    public void setKeepPassword(boolean arg_keepPassword) { gen_keepPassword = arg_keepPassword; }
    public boolean getFollowMouse() { return gen_followMouse; }
    public void setFollowMouse(boolean arg_followMouse) { gen_followMouse = arg_followMouse; }
    public boolean getUseRepeater() { return gen_useRepeater; }
    public void setUseRepeater(boolean arg_useRepeater) { gen_useRepeater = arg_useRepeater; }
    public long getMetaListId() { return gen_metaListId; }
    public void setMetaListId(long arg_metaListId) { gen_metaListId = arg_metaListId; }
    public long getLastMetaKeyId() { return gen_LAST_META_KEY_ID; }
    public void setLastMetaKeyId(long arg_LAST_META_KEY_ID) { gen_LAST_META_KEY_ID = arg_LAST_META_KEY_ID; }
    public boolean getFollowPan() { return gen_followPan; }
    public void setFollowPan(boolean arg_followPan) { gen_followPan = arg_followPan; }
    public String getUserName() { return gen_userName; }
    public void setUserName(String arg_userName) { gen_userName = arg_userName; }
    public String getSecureConnectionType() { return gen_secureConnectionType; }
    public void setSecureConnectionType(String arg_secureConnectionType) { gen_secureConnectionType = arg_secureConnectionType; }
    public boolean getShowZoomButtons() { return gen_showZoomButtons; }
    public void setShowZoomButtons(boolean arg_showZoomButtons) { gen_showZoomButtons = arg_showZoomButtons; }
    public String getDoubleTapActionAsString() { return gen_DOUBLE_TAP_ACTION; }
    public void setDoubleTapActionAsString(String arg_DOUBLE_TAP_ACTION) { gen_DOUBLE_TAP_ACTION = arg_DOUBLE_TAP_ACTION; }

    public android.content.ContentValues Gen_getValues() {
        android.content.ContentValues values=new android.content.ContentValues();
        values.put(GEN_FIELD__ID,Long.toString(this.gen__Id));
        values.put(GEN_FIELD_NICKNAME,this.gen_nickname);
        values.put(GEN_FIELD_ADDRESS,this.gen_address);
        values.put(GEN_FIELD_PORT,Integer.toString(this.gen_port));
        values.put(GEN_FIELD_PASSWORD,this.gen_password);
        values.put(GEN_FIELD_COLORMODEL,this.gen_colorModel);
        values.put(GEN_FIELD_FORCEFULL,Long.toString(this.gen_forceFull));
        values.put(GEN_FIELD_REPEATERID,this.gen_repeaterId);
        values.put(GEN_FIELD_INPUTMODE,this.gen_inputMode);
        values.put(GEN_FIELD_SCALEMODE,this.gen_SCALEMODE);
        values.put(GEN_FIELD_USELOCALCURSOR,(this.gen_useLocalCursor ? "1" : "0"));
        values.put(GEN_FIELD_KEEPPASSWORD,(this.gen_keepPassword ? "1" : "0"));
        values.put(GEN_FIELD_FOLLOWMOUSE,(this.gen_followMouse ? "1" : "0"));
        values.put(GEN_FIELD_USEREPEATER,(this.gen_useRepeater ? "1" : "0"));
        values.put(GEN_FIELD_METALISTID,Long.toString(this.gen_metaListId));
        values.put(GEN_FIELD_LAST_META_KEY_ID,Long.toString(this.gen_LAST_META_KEY_ID));
        values.put(GEN_FIELD_FOLLOWPAN,(this.gen_followPan ? "1" : "0"));
        values.put(GEN_FIELD_USERNAME,this.gen_userName);
        values.put(GEN_FIELD_SECURECONNECTIONTYPE,this.gen_secureConnectionType);
        values.put(GEN_FIELD_SHOWZOOMBUTTONS,(this.gen_showZoomButtons ? "1" : "0"));
        values.put(GEN_FIELD_DOUBLE_TAP_ACTION,this.gen_DOUBLE_TAP_ACTION);
        return values;
    }

    /**
     * Return an array that gives the column index in the cursor for each field defined
     * @param cursor Database cursor over some columns, possibly including this table
     * @return array of column indices; -1 if the column with that id is not in cursor
     */
    public int[] Gen_columnIndices(android.database.Cursor cursor) {
        int[] result=new int[GEN_COUNT];
        result[0] = cursor.getColumnIndex(GEN_FIELD__ID);
        // Make compatible with database generated by older version of plugin with uppercase column name
        if (result[0] == -1) {
            result[0] = cursor.getColumnIndex("_ID");
        }
        result[1] = cursor.getColumnIndex(GEN_FIELD_NICKNAME);
        result[2] = cursor.getColumnIndex(GEN_FIELD_ADDRESS);
        result[3] = cursor.getColumnIndex(GEN_FIELD_PORT);
        result[4] = cursor.getColumnIndex(GEN_FIELD_PASSWORD);
        result[5] = cursor.getColumnIndex(GEN_FIELD_COLORMODEL);
        result[6] = cursor.getColumnIndex(GEN_FIELD_FORCEFULL);
        result[7] = cursor.getColumnIndex(GEN_FIELD_REPEATERID);
        result[8] = cursor.getColumnIndex(GEN_FIELD_INPUTMODE);
        result[9] = cursor.getColumnIndex(GEN_FIELD_SCALEMODE);
        result[10] = cursor.getColumnIndex(GEN_FIELD_USELOCALCURSOR);
        result[11] = cursor.getColumnIndex(GEN_FIELD_KEEPPASSWORD);
        result[12] = cursor.getColumnIndex(GEN_FIELD_FOLLOWMOUSE);
        result[13] = cursor.getColumnIndex(GEN_FIELD_USEREPEATER);
        result[14] = cursor.getColumnIndex(GEN_FIELD_METALISTID);
        result[15] = cursor.getColumnIndex(GEN_FIELD_LAST_META_KEY_ID);
        result[16] = cursor.getColumnIndex(GEN_FIELD_FOLLOWPAN);
        result[17] = cursor.getColumnIndex(GEN_FIELD_USERNAME);
        result[18] = cursor.getColumnIndex(GEN_FIELD_SECURECONNECTIONTYPE);
        result[19] = cursor.getColumnIndex(GEN_FIELD_SHOWZOOMBUTTONS);
        result[20] = cursor.getColumnIndex(GEN_FIELD_DOUBLE_TAP_ACTION);
        return result;
    }

    /**
     * Populate one instance from a cursor 
     */
    public void Gen_populate(android.database.Cursor cursor,int[] columnIndices) {
        if ( columnIndices[GEN_ID__ID] >= 0 && ! cursor.isNull(columnIndices[GEN_ID__ID])) {
            gen__Id = cursor.getLong(columnIndices[GEN_ID__ID]);
        }
        if ( columnIndices[GEN_ID_NICKNAME] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_NICKNAME])) {
            gen_nickname = cursor.getString(columnIndices[GEN_ID_NICKNAME]);
        }
        if ( columnIndices[GEN_ID_ADDRESS] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_ADDRESS])) {
            gen_address = cursor.getString(columnIndices[GEN_ID_ADDRESS]);
        }
        if ( columnIndices[GEN_ID_PORT] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_PORT])) {
            gen_port = (int)cursor.getInt(columnIndices[GEN_ID_PORT]);
        }
        if ( columnIndices[GEN_ID_PASSWORD] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_PASSWORD])) {
            gen_password = cursor.getString(columnIndices[GEN_ID_PASSWORD]);
        }
        if ( columnIndices[GEN_ID_COLORMODEL] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_COLORMODEL])) {
            gen_colorModel = cursor.getString(columnIndices[GEN_ID_COLORMODEL]);
        }
        if ( columnIndices[GEN_ID_FORCEFULL] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_FORCEFULL])) {
            gen_forceFull = cursor.getLong(columnIndices[GEN_ID_FORCEFULL]);
        }
        if ( columnIndices[GEN_ID_REPEATERID] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_REPEATERID])) {
            gen_repeaterId = cursor.getString(columnIndices[GEN_ID_REPEATERID]);
        }
        if ( columnIndices[GEN_ID_INPUTMODE] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_INPUTMODE])) {
            gen_inputMode = cursor.getString(columnIndices[GEN_ID_INPUTMODE]);
        }
        if ( columnIndices[GEN_ID_SCALEMODE] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_SCALEMODE])) {
            gen_SCALEMODE = cursor.getString(columnIndices[GEN_ID_SCALEMODE]);
        }
        if ( columnIndices[GEN_ID_USELOCALCURSOR] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_USELOCALCURSOR])) {
            gen_useLocalCursor = (cursor.getInt(columnIndices[GEN_ID_USELOCALCURSOR]) != 0);
        }
        if ( columnIndices[GEN_ID_KEEPPASSWORD] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_KEEPPASSWORD])) {
            gen_keepPassword = (cursor.getInt(columnIndices[GEN_ID_KEEPPASSWORD]) != 0);
        }
        if ( columnIndices[GEN_ID_FOLLOWMOUSE] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_FOLLOWMOUSE])) {
            gen_followMouse = (cursor.getInt(columnIndices[GEN_ID_FOLLOWMOUSE]) != 0);
        }
        if ( columnIndices[GEN_ID_USEREPEATER] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_USEREPEATER])) {
            gen_useRepeater = (cursor.getInt(columnIndices[GEN_ID_USEREPEATER]) != 0);
        }
        if ( columnIndices[GEN_ID_METALISTID] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_METALISTID])) {
            gen_metaListId = cursor.getLong(columnIndices[GEN_ID_METALISTID]);
        }
        if ( columnIndices[GEN_ID_LAST_META_KEY_ID] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_LAST_META_KEY_ID])) {
            gen_LAST_META_KEY_ID = cursor.getLong(columnIndices[GEN_ID_LAST_META_KEY_ID]);
        }
        if ( columnIndices[GEN_ID_FOLLOWPAN] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_FOLLOWPAN])) {
            gen_followPan = (cursor.getInt(columnIndices[GEN_ID_FOLLOWPAN]) != 0);
        }
        if ( columnIndices[GEN_ID_USERNAME] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_USERNAME])) {
            gen_userName = cursor.getString(columnIndices[GEN_ID_USERNAME]);
        }
        if ( columnIndices[GEN_ID_SECURECONNECTIONTYPE] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_SECURECONNECTIONTYPE])) {
            gen_secureConnectionType = cursor.getString(columnIndices[GEN_ID_SECURECONNECTIONTYPE]);
        }
        if ( columnIndices[GEN_ID_SHOWZOOMBUTTONS] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_SHOWZOOMBUTTONS])) {
            gen_showZoomButtons = (cursor.getInt(columnIndices[GEN_ID_SHOWZOOMBUTTONS]) != 0);
        }
        if ( columnIndices[GEN_ID_DOUBLE_TAP_ACTION] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_DOUBLE_TAP_ACTION])) {
            gen_DOUBLE_TAP_ACTION = cursor.getString(columnIndices[GEN_ID_DOUBLE_TAP_ACTION]);
        }
    }

    /**
     * Populate one instance from a ContentValues 
     */
    public void Gen_populate(android.content.ContentValues values) {
        gen__Id = values.getAsLong(GEN_FIELD__ID);
        gen_nickname = values.getAsString(GEN_FIELD_NICKNAME);
        gen_address = values.getAsString(GEN_FIELD_ADDRESS);
        gen_port = (int)values.getAsInteger(GEN_FIELD_PORT);
        gen_password = values.getAsString(GEN_FIELD_PASSWORD);
        gen_colorModel = values.getAsString(GEN_FIELD_COLORMODEL);
        gen_forceFull = values.getAsLong(GEN_FIELD_FORCEFULL);
        gen_repeaterId = values.getAsString(GEN_FIELD_REPEATERID);
        gen_inputMode = values.getAsString(GEN_FIELD_INPUTMODE);
        gen_SCALEMODE = values.getAsString(GEN_FIELD_SCALEMODE);
        gen_useLocalCursor = (values.getAsInteger(GEN_FIELD_USELOCALCURSOR) != 0);
        gen_keepPassword = (values.getAsInteger(GEN_FIELD_KEEPPASSWORD) != 0);
        gen_followMouse = (values.getAsInteger(GEN_FIELD_FOLLOWMOUSE) != 0);
        gen_useRepeater = (values.getAsInteger(GEN_FIELD_USEREPEATER) != 0);
        gen_metaListId = values.getAsLong(GEN_FIELD_METALISTID);
        gen_LAST_META_KEY_ID = values.getAsLong(GEN_FIELD_LAST_META_KEY_ID);
        gen_followPan = (values.getAsInteger(GEN_FIELD_FOLLOWPAN) != 0);
        gen_userName = values.getAsString(GEN_FIELD_USERNAME);
        gen_secureConnectionType = values.getAsString(GEN_FIELD_SECURECONNECTIONTYPE);
        gen_showZoomButtons = (values.getAsInteger(GEN_FIELD_SHOWZOOMBUTTONS) != 0);
        gen_DOUBLE_TAP_ACTION = values.getAsString(GEN_FIELD_DOUBLE_TAP_ACTION);
    }
}
