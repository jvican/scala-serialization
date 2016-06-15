/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.komanov.serialization.domain.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-06-15")
public class BlogComponentDataPb implements org.apache.thrift.TBase<BlogComponentDataPb, BlogComponentDataPb._Fields>, java.io.Serializable, Cloneable, Comparable<BlogComponentDataPb> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BlogComponentDataPb");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RSS_FIELD_DESC = new org.apache.thrift.protocol.TField("rss", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField TAGS_FIELD_DESC = new org.apache.thrift.protocol.TField("tags", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BlogComponentDataPbStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BlogComponentDataPbTupleSchemeFactory());
  }

  public String name; // optional
  public boolean rss; // optional
  public boolean tags; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    RSS((short)2, "rss"),
    TAGS((short)3, "tags");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // RSS
          return RSS;
        case 3: // TAGS
          return TAGS;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RSS_ISSET_ID = 0;
  private static final int __TAGS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NAME,_Fields.RSS,_Fields.TAGS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RSS, new org.apache.thrift.meta_data.FieldMetaData("rss", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TAGS, new org.apache.thrift.meta_data.FieldMetaData("tags", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BlogComponentDataPb.class, metaDataMap);
  }

  public BlogComponentDataPb() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BlogComponentDataPb(BlogComponentDataPb other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.rss = other.rss;
    this.tags = other.tags;
  }

  public BlogComponentDataPb deepCopy() {
    return new BlogComponentDataPb(this);
  }

  @Override
  public void clear() {
    this.name = null;
    setRssIsSet(false);
    this.rss = false;
    setTagsIsSet(false);
    this.tags = false;
  }

  public String getName() {
    return this.name;
  }

  public BlogComponentDataPb setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public boolean isRss() {
    return this.rss;
  }

  public BlogComponentDataPb setRss(boolean rss) {
    this.rss = rss;
    setRssIsSet(true);
    return this;
  }

  public void unsetRss() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RSS_ISSET_ID);
  }

  /** Returns true if field rss is set (has been assigned a value) and false otherwise */
  public boolean isSetRss() {
    return EncodingUtils.testBit(__isset_bitfield, __RSS_ISSET_ID);
  }

  public void setRssIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RSS_ISSET_ID, value);
  }

  public boolean isTags() {
    return this.tags;
  }

  public BlogComponentDataPb setTags(boolean tags) {
    this.tags = tags;
    setTagsIsSet(true);
    return this;
  }

  public void unsetTags() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TAGS_ISSET_ID);
  }

  /** Returns true if field tags is set (has been assigned a value) and false otherwise */
  public boolean isSetTags() {
    return EncodingUtils.testBit(__isset_bitfield, __TAGS_ISSET_ID);
  }

  public void setTagsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TAGS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case RSS:
      if (value == null) {
        unsetRss();
      } else {
        setRss((Boolean)value);
      }
      break;

    case TAGS:
      if (value == null) {
        unsetTags();
      } else {
        setTags((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case RSS:
      return isRss();

    case TAGS:
      return isTags();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case RSS:
      return isSetRss();
    case TAGS:
      return isSetTags();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BlogComponentDataPb)
      return this.equals((BlogComponentDataPb)that);
    return false;
  }

  public boolean equals(BlogComponentDataPb that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_rss = true && this.isSetRss();
    boolean that_present_rss = true && that.isSetRss();
    if (this_present_rss || that_present_rss) {
      if (!(this_present_rss && that_present_rss))
        return false;
      if (this.rss != that.rss)
        return false;
    }

    boolean this_present_tags = true && this.isSetTags();
    boolean that_present_tags = true && that.isSetTags();
    if (this_present_tags || that_present_tags) {
      if (!(this_present_tags && that_present_tags))
        return false;
      if (this.tags != that.tags)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_rss = true && (isSetRss());
    list.add(present_rss);
    if (present_rss)
      list.add(rss);

    boolean present_tags = true && (isSetTags());
    list.add(present_tags);
    if (present_tags)
      list.add(tags);

    return list.hashCode();
  }

  @Override
  public int compareTo(BlogComponentDataPb other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRss()).compareTo(other.isSetRss());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRss()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rss, other.rss);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTags()).compareTo(other.isSetTags());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTags()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tags, other.tags);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BlogComponentDataPb(");
    boolean first = true;

    if (isSetName()) {
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetRss()) {
      if (!first) sb.append(", ");
      sb.append("rss:");
      sb.append(this.rss);
      first = false;
    }
    if (isSetTags()) {
      if (!first) sb.append(", ");
      sb.append("tags:");
      sb.append(this.tags);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BlogComponentDataPbStandardSchemeFactory implements SchemeFactory {
    public BlogComponentDataPbStandardScheme getScheme() {
      return new BlogComponentDataPbStandardScheme();
    }
  }

  private static class BlogComponentDataPbStandardScheme extends StandardScheme<BlogComponentDataPb> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BlogComponentDataPb struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RSS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.rss = iprot.readBool();
              struct.setRssIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TAGS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.tags = iprot.readBool();
              struct.setTagsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BlogComponentDataPb struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetRss()) {
        oprot.writeFieldBegin(RSS_FIELD_DESC);
        oprot.writeBool(struct.rss);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTags()) {
        oprot.writeFieldBegin(TAGS_FIELD_DESC);
        oprot.writeBool(struct.tags);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BlogComponentDataPbTupleSchemeFactory implements SchemeFactory {
    public BlogComponentDataPbTupleScheme getScheme() {
      return new BlogComponentDataPbTupleScheme();
    }
  }

  private static class BlogComponentDataPbTupleScheme extends TupleScheme<BlogComponentDataPb> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BlogComponentDataPb struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetRss()) {
        optionals.set(1);
      }
      if (struct.isSetTags()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetRss()) {
        oprot.writeBool(struct.rss);
      }
      if (struct.isSetTags()) {
        oprot.writeBool(struct.tags);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BlogComponentDataPb struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.rss = iprot.readBool();
        struct.setRssIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tags = iprot.readBool();
        struct.setTagsIsSet(true);
      }
    }
  }

}

