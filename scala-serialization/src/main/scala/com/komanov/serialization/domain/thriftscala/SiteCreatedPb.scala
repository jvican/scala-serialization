/**
 * Generated by Scrooge
 *   version: 4.7.0
 *   rev: d9d56174937f524a1981b38ebd6280eef7eeda4a
 *   built at: 20160427-121531
 */
package com.komanov.serialization.domain.thriftscala

import com.twitter.scrooge.{
  LazyTProtocol,
  TFieldBlob, ThriftException, ThriftStruct, ThriftStructCodec3, ThriftStructFieldInfo,
  ThriftStructMetaData, ThriftUtil}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport}
import java.nio.ByteBuffer
import java.util.Arrays
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object SiteCreatedPb extends ThriftStructCodec3[SiteCreatedPb] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("SiteCreatedPb")
  val IdField = new TField("id", TType.STRING, 1)
  val IdFieldManifest = implicitly[Manifest[ByteBuffer]]
  val OwnerIdField = new TField("ownerId", TType.STRING, 2)
  val OwnerIdFieldManifest = implicitly[Manifest[ByteBuffer]]
  val SiteTypeField = new TField("siteType", TType.ENUM, 3)
  val SiteTypeFieldI32 = new TField("siteType", TType.I32, 3)
  val SiteTypeFieldManifest = implicitly[Manifest[com.komanov.serialization.domain.thriftscala.SiteTypePb]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      IdField,
      true,
      false,
      IdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      OwnerIdField,
      true,
      false,
      OwnerIdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      SiteTypeField,
      true,
      false,
      SiteTypeFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: SiteCreatedPb): Unit = {
  }

  def withoutPassthroughFields(original: SiteCreatedPb): SiteCreatedPb =
    new Immutable(
      id =
        {
          val field = original.id
          field.map { field =>
            field
          }
        },
      ownerId =
        {
          val field = original.ownerId
          field.map { field =>
            field
          }
        },
      siteType =
        {
          val field = original.siteType
          field.map { field =>
            field
          }
        }
    )

  override def encode(_item: SiteCreatedPb, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): SiteCreatedPb = {

    var id: Option[ByteBuffer] = None
    var ownerId: Option[ByteBuffer] = None
    var siteType: Option[com.komanov.serialization.domain.thriftscala.SiteTypePb] = None

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
    
                id = Some(readIdValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'id' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
    
                ownerId = Some(readOwnerIdValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'ownerId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I32 | TType.ENUM =>
    
                siteType = Some(readSiteTypeValue(_iprot))
              case _actualType =>
                val _expectedType = TType.ENUM
                throw new TProtocolException(
                  "Received wrong type for field 'siteType' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      id,
      ownerId,
      siteType,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): SiteCreatedPb =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[this] def eagerDecode(_iprot: TProtocol): SiteCreatedPb = {
    var id: _root_.scala.Option[ByteBuffer] = _root_.scala.None
    var ownerId: _root_.scala.Option[ByteBuffer] = _root_.scala.None
    var siteType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.SiteTypePb] = _root_.scala.None
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                id = _root_.scala.Some(readIdValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'id' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                ownerId = _root_.scala.Some(readOwnerIdValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'ownerId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I32 | TType.ENUM =>
                siteType = _root_.scala.Some(readSiteTypeValue(_iprot))
              case _actualType =>
                val _expectedType = TType.ENUM
                throw new TProtocolException(
                  "Received wrong type for field 'siteType' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new Immutable(
      id,
      ownerId,
      siteType,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    id: _root_.scala.Option[ByteBuffer] = _root_.scala.None,
    ownerId: _root_.scala.Option[ByteBuffer] = _root_.scala.None,
    siteType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.SiteTypePb] = _root_.scala.None
  ): SiteCreatedPb =
    new Immutable(
      id,
      ownerId,
      siteType
    )

  def unapply(_item: SiteCreatedPb): _root_.scala.Option[scala.Product3[Option[ByteBuffer], Option[ByteBuffer], Option[com.komanov.serialization.domain.thriftscala.SiteTypePb]]] = _root_.scala.Some(_item)


  @inline private def readIdValue(_iprot: TProtocol): ByteBuffer = {
    _iprot.readBinary()
  }

  @inline private def writeIdField(id_item: ByteBuffer, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(IdField)
    writeIdValue(id_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeIdValue(id_item: ByteBuffer, _oprot: TProtocol): Unit = {
    _oprot.writeBinary(id_item)
  }

  @inline private def readOwnerIdValue(_iprot: TProtocol): ByteBuffer = {
    _iprot.readBinary()
  }

  @inline private def writeOwnerIdField(ownerId_item: ByteBuffer, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(OwnerIdField)
    writeOwnerIdValue(ownerId_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeOwnerIdValue(ownerId_item: ByteBuffer, _oprot: TProtocol): Unit = {
    _oprot.writeBinary(ownerId_item)
  }

  @inline private def readSiteTypeValue(_iprot: TProtocol): com.komanov.serialization.domain.thriftscala.SiteTypePb = {
    com.komanov.serialization.domain.thriftscala.SiteTypePb.getOrUnknown(_iprot.readI32())
  }

  @inline private def writeSiteTypeField(siteType_item: com.komanov.serialization.domain.thriftscala.SiteTypePb, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(SiteTypeFieldI32)
    writeSiteTypeValue(siteType_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeSiteTypeValue(siteType_item: com.komanov.serialization.domain.thriftscala.SiteTypePb, _oprot: TProtocol): Unit = {
    _oprot.writeI32(siteType_item.value)
  }


  object Immutable extends ThriftStructCodec3[SiteCreatedPb] {
    override def encode(_item: SiteCreatedPb, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): SiteCreatedPb = SiteCreatedPb.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[SiteCreatedPb] = SiteCreatedPb.metaData
  }

  /**
   * The default read-only implementation of SiteCreatedPb.  You typically should not need to
   * directly reference this class; instead, use the SiteCreatedPb.apply method to construct
   * new instances.
   */
  class Immutable(
      val id: _root_.scala.Option[ByteBuffer],
      val ownerId: _root_.scala.Option[ByteBuffer],
      val siteType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.SiteTypePb],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends SiteCreatedPb {
    def this(
      id: _root_.scala.Option[ByteBuffer] = _root_.scala.None,
      ownerId: _root_.scala.Option[ByteBuffer] = _root_.scala.None,
      siteType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.SiteTypePb] = _root_.scala.None
    ) = this(
      id,
      ownerId,
      siteType,
      Map.empty
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      val id: _root_.scala.Option[ByteBuffer],
      val ownerId: _root_.scala.Option[ByteBuffer],
      val siteType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.SiteTypePb],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends SiteCreatedPb {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }


    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the SiteCreatedPb trait with additional state or
   * behavior and implement the read-only methods from SiteCreatedPb using an underlying
   * instance.
   */
  trait Proxy extends SiteCreatedPb {
    protected def _underlying_SiteCreatedPb: SiteCreatedPb
    override def id: _root_.scala.Option[ByteBuffer] = _underlying_SiteCreatedPb.id
    override def ownerId: _root_.scala.Option[ByteBuffer] = _underlying_SiteCreatedPb.ownerId
    override def siteType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.SiteTypePb] = _underlying_SiteCreatedPb.siteType
    override def _passthroughFields = _underlying_SiteCreatedPb._passthroughFields
  }
}

trait SiteCreatedPb
  extends ThriftStruct
  with scala.Product3[Option[ByteBuffer], Option[ByteBuffer], Option[com.komanov.serialization.domain.thriftscala.SiteTypePb]]
  with java.io.Serializable
{
  import SiteCreatedPb._

  def id: _root_.scala.Option[ByteBuffer]
  def ownerId: _root_.scala.Option[ByteBuffer]
  def siteType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.SiteTypePb]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = id
  def _2 = ownerId
  def _3 = siteType


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (id.isDefined) {
                writeIdValue(id.get, _oprot)
                _root_.scala.Some(SiteCreatedPb.IdField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (ownerId.isDefined) {
                writeOwnerIdValue(ownerId.get, _oprot)
                _root_.scala.Some(SiteCreatedPb.OwnerIdField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (siteType.isDefined) {
                writeSiteTypeValue(siteType.get, _oprot)
                _root_.scala.Some(SiteCreatedPb.SiteTypeField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            val _data = Arrays.copyOfRange(_buff.getArray, 0, _buff.length)
            _root_.scala.Some(TFieldBlob(_field, _data))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): SiteCreatedPb = {
    var id: _root_.scala.Option[ByteBuffer] = this.id
    var ownerId: _root_.scala.Option[ByteBuffer] = this.ownerId
    var siteType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.SiteTypePb] = this.siteType
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        id = _root_.scala.Some(readIdValue(_blob.read))
      case 2 =>
        ownerId = _root_.scala.Some(readOwnerIdValue(_blob.read))
      case 3 =>
        siteType = _root_.scala.Some(readSiteTypeValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      id,
      ownerId,
      siteType,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): SiteCreatedPb = {
    var id: _root_.scala.Option[ByteBuffer] = this.id
    var ownerId: _root_.scala.Option[ByteBuffer] = this.ownerId
    var siteType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.SiteTypePb] = this.siteType

    _fieldId match {
      case 1 =>
        id = _root_.scala.None
      case 2 =>
        ownerId = _root_.scala.None
      case 3 =>
        siteType = _root_.scala.None
      case _ =>
    }
    new Immutable(
      id,
      ownerId,
      siteType,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetId: SiteCreatedPb = unsetField(1)

  def unsetOwnerId: SiteCreatedPb = unsetField(2)

  def unsetSiteType: SiteCreatedPb = unsetField(3)


  override def write(_oprot: TProtocol): Unit = {
    SiteCreatedPb.validate(this)
    _oprot.writeStructBegin(Struct)
    if (id.isDefined) writeIdField(id.get, _oprot)
    if (ownerId.isDefined) writeOwnerIdField(ownerId.get, _oprot)
    if (siteType.isDefined) writeSiteTypeField(siteType.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    id: _root_.scala.Option[ByteBuffer] = this.id,
    ownerId: _root_.scala.Option[ByteBuffer] = this.ownerId,
    siteType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.SiteTypePb] = this.siteType,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): SiteCreatedPb =
    new Immutable(
      id,
      ownerId,
      siteType,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[SiteCreatedPb]

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _root_.scala.runtime.ScalaRunTime._equals(this, other) &&
      _passthroughFields == other.asInstanceOf[SiteCreatedPb]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 3

  override def productElement(n: Int): Any = n match {
    case 0 => this.id
    case 1 => this.ownerId
    case 2 => this.siteType
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "SiteCreatedPb"
}