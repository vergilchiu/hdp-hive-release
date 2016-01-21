/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.cli.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-1-21")
public class TFetchResultsResp implements org.apache.thrift.TBase<TFetchResultsResp, TFetchResultsResp._Fields>, java.io.Serializable, Cloneable, Comparable<TFetchResultsResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFetchResultsResp");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField HAS_MORE_ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("hasMoreRows", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField RESULTS_FIELD_DESC = new org.apache.thrift.protocol.TField("results", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TFetchResultsRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TFetchResultsRespTupleSchemeFactory());
  }

  private TStatus status; // required
  private boolean hasMoreRows; // optional
  private TRowSet results; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    HAS_MORE_ROWS((short)2, "hasMoreRows"),
    RESULTS((short)3, "results");

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
        case 1: // STATUS
          return STATUS;
        case 2: // HAS_MORE_ROWS
          return HAS_MORE_ROWS;
        case 3: // RESULTS
          return RESULTS;
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
  private static final int __HASMOREROWS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.HAS_MORE_ROWS,_Fields.RESULTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TStatus.class)));
    tmpMap.put(_Fields.HAS_MORE_ROWS, new org.apache.thrift.meta_data.FieldMetaData("hasMoreRows", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.RESULTS, new org.apache.thrift.meta_data.FieldMetaData("results", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TRowSet.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFetchResultsResp.class, metaDataMap);
  }

  public TFetchResultsResp() {
  }

  public TFetchResultsResp(
    TStatus status)
  {
    this();
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFetchResultsResp(TFetchResultsResp other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new TStatus(other.status);
    }
    this.hasMoreRows = other.hasMoreRows;
    if (other.isSetResults()) {
      this.results = new TRowSet(other.results);
    }
  }

  public TFetchResultsResp deepCopy() {
    return new TFetchResultsResp(this);
  }

  @Override
  public void clear() {
    this.status = null;
    setHasMoreRowsIsSet(false);
    this.hasMoreRows = false;
    this.results = null;
  }

  public TStatus getStatus() {
    return this.status;
  }

  public void setStatus(TStatus status) {
    this.status = status;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public boolean isHasMoreRows() {
    return this.hasMoreRows;
  }

  public void setHasMoreRows(boolean hasMoreRows) {
    this.hasMoreRows = hasMoreRows;
    setHasMoreRowsIsSet(true);
  }

  public void unsetHasMoreRows() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HASMOREROWS_ISSET_ID);
  }

  /** Returns true if field hasMoreRows is set (has been assigned a value) and false otherwise */
  public boolean isSetHasMoreRows() {
    return EncodingUtils.testBit(__isset_bitfield, __HASMOREROWS_ISSET_ID);
  }

  public void setHasMoreRowsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HASMOREROWS_ISSET_ID, value);
  }

  public TRowSet getResults() {
    return this.results;
  }

  public void setResults(TRowSet results) {
    this.results = results;
  }

  public void unsetResults() {
    this.results = null;
  }

  /** Returns true if field results is set (has been assigned a value) and false otherwise */
  public boolean isSetResults() {
    return this.results != null;
  }

  public void setResultsIsSet(boolean value) {
    if (!value) {
      this.results = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((TStatus)value);
      }
      break;

    case HAS_MORE_ROWS:
      if (value == null) {
        unsetHasMoreRows();
      } else {
        setHasMoreRows((Boolean)value);
      }
      break;

    case RESULTS:
      if (value == null) {
        unsetResults();
      } else {
        setResults((TRowSet)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case HAS_MORE_ROWS:
      return Boolean.valueOf(isHasMoreRows());

    case RESULTS:
      return getResults();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case HAS_MORE_ROWS:
      return isSetHasMoreRows();
    case RESULTS:
      return isSetResults();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TFetchResultsResp)
      return this.equals((TFetchResultsResp)that);
    return false;
  }

  public boolean equals(TFetchResultsResp that) {
    if (that == null)
      return false;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_hasMoreRows = true && this.isSetHasMoreRows();
    boolean that_present_hasMoreRows = true && that.isSetHasMoreRows();
    if (this_present_hasMoreRows || that_present_hasMoreRows) {
      if (!(this_present_hasMoreRows && that_present_hasMoreRows))
        return false;
      if (this.hasMoreRows != that.hasMoreRows)
        return false;
    }

    boolean this_present_results = true && this.isSetResults();
    boolean that_present_results = true && that.isSetResults();
    if (this_present_results || that_present_results) {
      if (!(this_present_results && that_present_results))
        return false;
      if (!this.results.equals(that.results))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status);

    boolean present_hasMoreRows = true && (isSetHasMoreRows());
    list.add(present_hasMoreRows);
    if (present_hasMoreRows)
      list.add(hasMoreRows);

    boolean present_results = true && (isSetResults());
    list.add(present_results);
    if (present_results)
      list.add(results);

    return list.hashCode();
  }

  @Override
  public int compareTo(TFetchResultsResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHasMoreRows()).compareTo(other.isSetHasMoreRows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasMoreRows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hasMoreRows, other.hasMoreRows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResults()).compareTo(other.isSetResults());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResults()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.results, other.results);
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
    StringBuilder sb = new StringBuilder("TFetchResultsResp(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetHasMoreRows()) {
      if (!first) sb.append(", ");
      sb.append("hasMoreRows:");
      sb.append(this.hasMoreRows);
      first = false;
    }
    if (isSetResults()) {
      if (!first) sb.append(", ");
      sb.append("results:");
      if (this.results == null) {
        sb.append("null");
      } else {
        sb.append(this.results);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetStatus()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
    if (results != null) {
      results.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TFetchResultsRespStandardSchemeFactory implements SchemeFactory {
    public TFetchResultsRespStandardScheme getScheme() {
      return new TFetchResultsRespStandardScheme();
    }
  }

  private static class TFetchResultsRespStandardScheme extends StandardScheme<TFetchResultsResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFetchResultsResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HAS_MORE_ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.hasMoreRows = iprot.readBool();
              struct.setHasMoreRowsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESULTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.results = new TRowSet();
              struct.results.read(iprot);
              struct.setResultsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFetchResultsResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetHasMoreRows()) {
        oprot.writeFieldBegin(HAS_MORE_ROWS_FIELD_DESC);
        oprot.writeBool(struct.hasMoreRows);
        oprot.writeFieldEnd();
      }
      if (struct.results != null) {
        if (struct.isSetResults()) {
          oprot.writeFieldBegin(RESULTS_FIELD_DESC);
          struct.results.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFetchResultsRespTupleSchemeFactory implements SchemeFactory {
    public TFetchResultsRespTupleScheme getScheme() {
      return new TFetchResultsRespTupleScheme();
    }
  }

  private static class TFetchResultsRespTupleScheme extends TupleScheme<TFetchResultsResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFetchResultsResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.status.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetHasMoreRows()) {
        optionals.set(0);
      }
      if (struct.isSetResults()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetHasMoreRows()) {
        oprot.writeBool(struct.hasMoreRows);
      }
      if (struct.isSetResults()) {
        struct.results.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFetchResultsResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.status = new TStatus();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.hasMoreRows = iprot.readBool();
        struct.setHasMoreRowsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.results = new TRowSet();
        struct.results.read(iprot);
        struct.setResultsIsSet(true);
      }
    }
  }

}

