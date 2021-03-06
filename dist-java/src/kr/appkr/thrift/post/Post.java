/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package kr.appkr.thrift.post;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * Post 엔티티
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-02-21")
public class Post implements org.apache.thrift.TBase<Post, Post._Fields>, java.io.Serializable, Cloneable, Comparable<Post> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Post");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CREATED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("created_at", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField UPDATED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("updated_at", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PostStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PostTupleSchemeFactory();

  /**
   * 기본 키
   */
  public int id; // optional
  /**
   * 포스트 제목
   */
  public java.lang.String title; // optional
  /**
   * 포스트 본문
   */
  public java.lang.String content; // optional
  /**
   * 포스트 최초 생성 시각
   */
  public java.lang.String created_at; // optional
  /**
   * 포스트 최종 수정 시각
   */
  public java.lang.String updated_at; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 기본 키
     */
    ID((short)1, "id"),
    /**
     * 포스트 제목
     */
    TITLE((short)2, "title"),
    /**
     * 포스트 본문
     */
    CONTENT((short)3, "content"),
    /**
     * 포스트 최초 생성 시각
     */
    CREATED_AT((short)4, "created_at"),
    /**
     * 포스트 최종 수정 시각
     */
    UPDATED_AT((short)5, "updated_at");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // TITLE
          return TITLE;
        case 3: // CONTENT
          return CONTENT;
        case 4: // CREATED_AT
          return CREATED_AT;
        case 5: // UPDATED_AT
          return UPDATED_AT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.TITLE,_Fields.CONTENT,_Fields.CREATED_AT,_Fields.UPDATED_AT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATED_AT, new org.apache.thrift.meta_data.FieldMetaData("created_at", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPDATED_AT, new org.apache.thrift.meta_data.FieldMetaData("updated_at", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Post.class, metaDataMap);
  }

  public Post() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Post(Post other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetContent()) {
      this.content = other.content;
    }
    if (other.isSetCreated_at()) {
      this.created_at = other.created_at;
    }
    if (other.isSetUpdated_at()) {
      this.updated_at = other.updated_at;
    }
  }

  public Post deepCopy() {
    return new Post(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.title = null;
    this.content = null;
    this.created_at = null;
    this.updated_at = null;
  }

  /**
   * 기본 키
   */
  public int getId() {
    return this.id;
  }

  /**
   * 기본 키
   */
  public Post setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  /**
   * 포스트 제목
   */
  public java.lang.String getTitle() {
    return this.title;
  }

  /**
   * 포스트 제목
   */
  public Post setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  /**
   * 포스트 본문
   */
  public java.lang.String getContent() {
    return this.content;
  }

  /**
   * 포스트 본문
   */
  public Post setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
    }
  }

  /**
   * 포스트 최초 생성 시각
   */
  public java.lang.String getCreated_at() {
    return this.created_at;
  }

  /**
   * 포스트 최초 생성 시각
   */
  public Post setCreated_at(java.lang.String created_at) {
    this.created_at = created_at;
    return this;
  }

  public void unsetCreated_at() {
    this.created_at = null;
  }

  /** Returns true if field created_at is set (has been assigned a value) and false otherwise */
  public boolean isSetCreated_at() {
    return this.created_at != null;
  }

  public void setCreated_atIsSet(boolean value) {
    if (!value) {
      this.created_at = null;
    }
  }

  /**
   * 포스트 최종 수정 시각
   */
  public java.lang.String getUpdated_at() {
    return this.updated_at;
  }

  /**
   * 포스트 최종 수정 시각
   */
  public Post setUpdated_at(java.lang.String updated_at) {
    this.updated_at = updated_at;
    return this;
  }

  public void unsetUpdated_at() {
    this.updated_at = null;
  }

  /** Returns true if field updated_at is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdated_at() {
    return this.updated_at != null;
  }

  public void setUpdated_atIsSet(boolean value) {
    if (!value) {
      this.updated_at = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Integer)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((java.lang.String)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((java.lang.String)value);
      }
      break;

    case CREATED_AT:
      if (value == null) {
        unsetCreated_at();
      } else {
        setCreated_at((java.lang.String)value);
      }
      break;

    case UPDATED_AT:
      if (value == null) {
        unsetUpdated_at();
      } else {
        setUpdated_at((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case TITLE:
      return getTitle();

    case CONTENT:
      return getContent();

    case CREATED_AT:
      return getCreated_at();

    case UPDATED_AT:
      return getUpdated_at();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case TITLE:
      return isSetTitle();
    case CONTENT:
      return isSetContent();
    case CREATED_AT:
      return isSetCreated_at();
    case UPDATED_AT:
      return isSetUpdated_at();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Post)
      return this.equals((Post)that);
    return false;
  }

  public boolean equals(Post that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
        return false;
    }

    boolean this_present_created_at = true && this.isSetCreated_at();
    boolean that_present_created_at = true && that.isSetCreated_at();
    if (this_present_created_at || that_present_created_at) {
      if (!(this_present_created_at && that_present_created_at))
        return false;
      if (!this.created_at.equals(that.created_at))
        return false;
    }

    boolean this_present_updated_at = true && this.isSetUpdated_at();
    boolean that_present_updated_at = true && that.isSetUpdated_at();
    if (this_present_updated_at || that_present_updated_at) {
      if (!(this_present_updated_at && that_present_updated_at))
        return false;
      if (!this.updated_at.equals(that.updated_at))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + ((isSetTitle()) ? 131071 : 524287);
    if (isSetTitle())
      hashCode = hashCode * 8191 + title.hashCode();

    hashCode = hashCode * 8191 + ((isSetContent()) ? 131071 : 524287);
    if (isSetContent())
      hashCode = hashCode * 8191 + content.hashCode();

    hashCode = hashCode * 8191 + ((isSetCreated_at()) ? 131071 : 524287);
    if (isSetCreated_at())
      hashCode = hashCode * 8191 + created_at.hashCode();

    hashCode = hashCode * 8191 + ((isSetUpdated_at()) ? 131071 : 524287);
    if (isSetUpdated_at())
      hashCode = hashCode * 8191 + updated_at.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Post other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, other.content);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreated_at()).compareTo(other.isSetCreated_at());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreated_at()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.created_at, other.created_at);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUpdated_at()).compareTo(other.isSetUpdated_at());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdated_at()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updated_at, other.updated_at);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Post(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetTitle()) {
      if (!first) sb.append(", ");
      sb.append("title:");
      if (this.title == null) {
        sb.append("null");
      } else {
        sb.append(this.title);
      }
      first = false;
    }
    if (isSetContent()) {
      if (!first) sb.append(", ");
      sb.append("content:");
      if (this.content == null) {
        sb.append("null");
      } else {
        sb.append(this.content);
      }
      first = false;
    }
    if (isSetCreated_at()) {
      if (!first) sb.append(", ");
      sb.append("created_at:");
      if (this.created_at == null) {
        sb.append("null");
      } else {
        sb.append(this.created_at);
      }
      first = false;
    }
    if (isSetUpdated_at()) {
      if (!first) sb.append(", ");
      sb.append("updated_at:");
      if (this.updated_at == null) {
        sb.append("null");
      } else {
        sb.append(this.updated_at);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PostStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PostStandardScheme getScheme() {
      return new PostStandardScheme();
    }
  }

  private static class PostStandardScheme extends org.apache.thrift.scheme.StandardScheme<Post> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Post struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.content = iprot.readString();
              struct.setContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CREATED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.created_at = iprot.readString();
              struct.setCreated_atIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // UPDATED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.updated_at = iprot.readString();
              struct.setUpdated_atIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Post struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI32(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.title != null) {
        if (struct.isSetTitle()) {
          oprot.writeFieldBegin(TITLE_FIELD_DESC);
          oprot.writeString(struct.title);
          oprot.writeFieldEnd();
        }
      }
      if (struct.content != null) {
        if (struct.isSetContent()) {
          oprot.writeFieldBegin(CONTENT_FIELD_DESC);
          oprot.writeString(struct.content);
          oprot.writeFieldEnd();
        }
      }
      if (struct.created_at != null) {
        if (struct.isSetCreated_at()) {
          oprot.writeFieldBegin(CREATED_AT_FIELD_DESC);
          oprot.writeString(struct.created_at);
          oprot.writeFieldEnd();
        }
      }
      if (struct.updated_at != null) {
        if (struct.isSetUpdated_at()) {
          oprot.writeFieldBegin(UPDATED_AT_FIELD_DESC);
          oprot.writeString(struct.updated_at);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PostTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PostTupleScheme getScheme() {
      return new PostTupleScheme();
    }
  }

  private static class PostTupleScheme extends org.apache.thrift.scheme.TupleScheme<Post> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Post struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetTitle()) {
        optionals.set(1);
      }
      if (struct.isSetContent()) {
        optionals.set(2);
      }
      if (struct.isSetCreated_at()) {
        optionals.set(3);
      }
      if (struct.isSetUpdated_at()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetContent()) {
        oprot.writeString(struct.content);
      }
      if (struct.isSetCreated_at()) {
        oprot.writeString(struct.created_at);
      }
      if (struct.isSetUpdated_at()) {
        oprot.writeString(struct.updated_at);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Post struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(2)) {
        struct.content = iprot.readString();
        struct.setContentIsSet(true);
      }
      if (incoming.get(3)) {
        struct.created_at = iprot.readString();
        struct.setCreated_atIsSet(true);
      }
      if (incoming.get(4)) {
        struct.updated_at = iprot.readString();
        struct.setUpdated_atIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

