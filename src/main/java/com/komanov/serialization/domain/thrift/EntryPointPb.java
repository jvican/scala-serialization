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
public class EntryPointPb implements org.apache.thrift.TBase<EntryPointPb, EntryPointPb._Fields>, java.io.Serializable, Cloneable, Comparable<EntryPointPb> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EntryPointPb");

  private static final org.apache.thrift.protocol.TField DOMAIN_FIELD_DESC = new org.apache.thrift.protocol.TField("domain", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField FREE_FIELD_DESC = new org.apache.thrift.protocol.TField("free", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EntryPointPbStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EntryPointPbTupleSchemeFactory());
  }

  public DomainEntryPointPb domain; // optional
  public FreeEntryPointPb free; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DOMAIN((short)1, "domain"),
    FREE((short)2, "free");

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
        case 1: // DOMAIN
          return DOMAIN;
        case 2: // FREE
          return FREE;
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
  private static final _Fields optionals[] = {_Fields.DOMAIN,_Fields.FREE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DOMAIN, new org.apache.thrift.meta_data.FieldMetaData("domain", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DomainEntryPointPb.class)));
    tmpMap.put(_Fields.FREE, new org.apache.thrift.meta_data.FieldMetaData("free", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FreeEntryPointPb.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EntryPointPb.class, metaDataMap);
  }

  public EntryPointPb() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EntryPointPb(EntryPointPb other) {
    if (other.isSetDomain()) {
      this.domain = new DomainEntryPointPb(other.domain);
    }
    if (other.isSetFree()) {
      this.free = new FreeEntryPointPb(other.free);
    }
  }

  public EntryPointPb deepCopy() {
    return new EntryPointPb(this);
  }

  @Override
  public void clear() {
    this.domain = null;
    this.free = null;
  }

  public DomainEntryPointPb getDomain() {
    return this.domain;
  }

  public EntryPointPb setDomain(DomainEntryPointPb domain) {
    this.domain = domain;
    return this;
  }

  public void unsetDomain() {
    this.domain = null;
  }

  /** Returns true if field domain is set (has been assigned a value) and false otherwise */
  public boolean isSetDomain() {
    return this.domain != null;
  }

  public void setDomainIsSet(boolean value) {
    if (!value) {
      this.domain = null;
    }
  }

  public FreeEntryPointPb getFree() {
    return this.free;
  }

  public EntryPointPb setFree(FreeEntryPointPb free) {
    this.free = free;
    return this;
  }

  public void unsetFree() {
    this.free = null;
  }

  /** Returns true if field free is set (has been assigned a value) and false otherwise */
  public boolean isSetFree() {
    return this.free != null;
  }

  public void setFreeIsSet(boolean value) {
    if (!value) {
      this.free = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DOMAIN:
      if (value == null) {
        unsetDomain();
      } else {
        setDomain((DomainEntryPointPb)value);
      }
      break;

    case FREE:
      if (value == null) {
        unsetFree();
      } else {
        setFree((FreeEntryPointPb)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DOMAIN:
      return getDomain();

    case FREE:
      return getFree();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DOMAIN:
      return isSetDomain();
    case FREE:
      return isSetFree();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EntryPointPb)
      return this.equals((EntryPointPb)that);
    return false;
  }

  public boolean equals(EntryPointPb that) {
    if (that == null)
      return false;

    boolean this_present_domain = true && this.isSetDomain();
    boolean that_present_domain = true && that.isSetDomain();
    if (this_present_domain || that_present_domain) {
      if (!(this_present_domain && that_present_domain))
        return false;
      if (!this.domain.equals(that.domain))
        return false;
    }

    boolean this_present_free = true && this.isSetFree();
    boolean that_present_free = true && that.isSetFree();
    if (this_present_free || that_present_free) {
      if (!(this_present_free && that_present_free))
        return false;
      if (!this.free.equals(that.free))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_domain = true && (isSetDomain());
    list.add(present_domain);
    if (present_domain)
      list.add(domain);

    boolean present_free = true && (isSetFree());
    list.add(present_free);
    if (present_free)
      list.add(free);

    return list.hashCode();
  }

  @Override
  public int compareTo(EntryPointPb other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDomain()).compareTo(other.isSetDomain());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDomain()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.domain, other.domain);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFree()).compareTo(other.isSetFree());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFree()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.free, other.free);
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
    StringBuilder sb = new StringBuilder("EntryPointPb(");
    boolean first = true;

    if (isSetDomain()) {
      sb.append("domain:");
      if (this.domain == null) {
        sb.append("null");
      } else {
        sb.append(this.domain);
      }
      first = false;
    }
    if (isSetFree()) {
      if (!first) sb.append(", ");
      sb.append("free:");
      if (this.free == null) {
        sb.append("null");
      } else {
        sb.append(this.free);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (domain != null) {
      domain.validate();
    }
    if (free != null) {
      free.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EntryPointPbStandardSchemeFactory implements SchemeFactory {
    public EntryPointPbStandardScheme getScheme() {
      return new EntryPointPbStandardScheme();
    }
  }

  private static class EntryPointPbStandardScheme extends StandardScheme<EntryPointPb> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EntryPointPb struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DOMAIN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.domain = new DomainEntryPointPb();
              struct.domain.read(iprot);
              struct.setDomainIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FREE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.free = new FreeEntryPointPb();
              struct.free.read(iprot);
              struct.setFreeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EntryPointPb struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.domain != null) {
        if (struct.isSetDomain()) {
          oprot.writeFieldBegin(DOMAIN_FIELD_DESC);
          struct.domain.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.free != null) {
        if (struct.isSetFree()) {
          oprot.writeFieldBegin(FREE_FIELD_DESC);
          struct.free.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EntryPointPbTupleSchemeFactory implements SchemeFactory {
    public EntryPointPbTupleScheme getScheme() {
      return new EntryPointPbTupleScheme();
    }
  }

  private static class EntryPointPbTupleScheme extends TupleScheme<EntryPointPb> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EntryPointPb struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDomain()) {
        optionals.set(0);
      }
      if (struct.isSetFree()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetDomain()) {
        struct.domain.write(oprot);
      }
      if (struct.isSetFree()) {
        struct.free.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EntryPointPb struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.domain = new DomainEntryPointPb();
        struct.domain.read(iprot);
        struct.setDomainIsSet(true);
      }
      if (incoming.get(1)) {
        struct.free = new FreeEntryPointPb();
        struct.free.read(iprot);
        struct.setFreeIsSet(true);
      }
    }
  }

}

