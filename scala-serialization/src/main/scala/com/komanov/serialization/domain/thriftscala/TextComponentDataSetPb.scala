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


object TextComponentDataSetPb extends ThriftStructCodec3[TextComponentDataSetPb] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("TextComponentDataSetPb")
  val IdField = new TField("id", TType.STRING, 1)
  val IdFieldManifest = implicitly[Manifest[ByteBuffer]]
  val TextField = new TField("text", TType.STRING, 2)
  val TextFieldManifest = implicitly[Manifest[String]]

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
      TextField,
      true,
      false,
      TextFieldManifest,
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
  def validate(_item: TextComponentDataSetPb): Unit = {
  }

  def withoutPassthroughFields(original: TextComponentDataSetPb): TextComponentDataSetPb =
    new Immutable(
      id =
        {
          val field = original.id
          field.map { field =>
            field
          }
        },
      text =
        {
          val field = original.text
          field.map { field =>
            field
          }
        }
    )

  override def encode(_item: TextComponentDataSetPb, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): TextComponentDataSetPb = {

    var id: Option[ByteBuffer] = None
    var textOffset: Int = -1

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
                textOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'text' (expected=%s, actual=%s).".format(
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
      textOffset,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): TextComponentDataSetPb =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[this] def eagerDecode(_iprot: TProtocol): TextComponentDataSetPb = {
    var id: _root_.scala.Option[ByteBuffer] = _root_.scala.None
    var text: _root_.scala.Option[String] = _root_.scala.None
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
                text = _root_.scala.Some(readTextValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'text' (expected=%s, actual=%s).".format(
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
      text,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    id: _root_.scala.Option[ByteBuffer] = _root_.scala.None,
    text: _root_.scala.Option[String] = _root_.scala.None
  ): TextComponentDataSetPb =
    new Immutable(
      id,
      text
    )

  def unapply(_item: TextComponentDataSetPb): _root_.scala.Option[scala.Product2[Option[ByteBuffer], Option[String]]] = _root_.scala.Some(_item)


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

  @inline private def readTextValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeTextField(text_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(TextField)
    writeTextValue(text_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeTextValue(text_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(text_item)
  }


  object Immutable extends ThriftStructCodec3[TextComponentDataSetPb] {
    override def encode(_item: TextComponentDataSetPb, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): TextComponentDataSetPb = TextComponentDataSetPb.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[TextComponentDataSetPb] = TextComponentDataSetPb.metaData
  }

  /**
   * The default read-only implementation of TextComponentDataSetPb.  You typically should not need to
   * directly reference this class; instead, use the TextComponentDataSetPb.apply method to construct
   * new instances.
   */
  class Immutable(
      val id: _root_.scala.Option[ByteBuffer],
      val text: _root_.scala.Option[String],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends TextComponentDataSetPb {
    def this(
      id: _root_.scala.Option[ByteBuffer] = _root_.scala.None,
      text: _root_.scala.Option[String] = _root_.scala.None
    ) = this(
      id,
      text,
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
      textOffset: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends TextComponentDataSetPb {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val text: _root_.scala.Option[String] =
      if (textOffset == -1)
        None
      else {
        Some(_proto.decodeString(_buf, textOffset))
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
   * This Proxy trait allows you to extend the TextComponentDataSetPb trait with additional state or
   * behavior and implement the read-only methods from TextComponentDataSetPb using an underlying
   * instance.
   */
  trait Proxy extends TextComponentDataSetPb {
    protected def _underlying_TextComponentDataSetPb: TextComponentDataSetPb
    override def id: _root_.scala.Option[ByteBuffer] = _underlying_TextComponentDataSetPb.id
    override def text: _root_.scala.Option[String] = _underlying_TextComponentDataSetPb.text
    override def _passthroughFields = _underlying_TextComponentDataSetPb._passthroughFields
  }
}

trait TextComponentDataSetPb
  extends ThriftStruct
  with scala.Product2[Option[ByteBuffer], Option[String]]
  with java.io.Serializable
{
  import TextComponentDataSetPb._

  def id: _root_.scala.Option[ByteBuffer]
  def text: _root_.scala.Option[String]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = id
  def _2 = text


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
                _root_.scala.Some(TextComponentDataSetPb.IdField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (text.isDefined) {
                writeTextValue(text.get, _oprot)
                _root_.scala.Some(TextComponentDataSetPb.TextField)
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
  def setField(_blob: TFieldBlob): TextComponentDataSetPb = {
    var id: _root_.scala.Option[ByteBuffer] = this.id
    var text: _root_.scala.Option[String] = this.text
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        id = _root_.scala.Some(readIdValue(_blob.read))
      case 2 =>
        text = _root_.scala.Some(readTextValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      id,
      text,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): TextComponentDataSetPb = {
    var id: _root_.scala.Option[ByteBuffer] = this.id
    var text: _root_.scala.Option[String] = this.text

    _fieldId match {
      case 1 =>
        id = _root_.scala.None
      case 2 =>
        text = _root_.scala.None
      case _ =>
    }
    new Immutable(
      id,
      text,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetId: TextComponentDataSetPb = unsetField(1)

  def unsetText: TextComponentDataSetPb = unsetField(2)


  override def write(_oprot: TProtocol): Unit = {
    TextComponentDataSetPb.validate(this)
    _oprot.writeStructBegin(Struct)
    if (id.isDefined) writeIdField(id.get, _oprot)
    if (text.isDefined) writeTextField(text.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    id: _root_.scala.Option[ByteBuffer] = this.id,
    text: _root_.scala.Option[String] = this.text,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): TextComponentDataSetPb =
    new Immutable(
      id,
      text,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[TextComponentDataSetPb]

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _root_.scala.runtime.ScalaRunTime._equals(this, other) &&
      _passthroughFields == other.asInstanceOf[TextComponentDataSetPb]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 2

  override def productElement(n: Int): Any = n match {
    case 0 => this.id
    case 1 => this.text
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "TextComponentDataSetPb"
}