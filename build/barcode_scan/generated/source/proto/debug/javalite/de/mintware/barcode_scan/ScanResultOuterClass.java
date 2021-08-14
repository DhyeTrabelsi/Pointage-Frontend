// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scan_result.proto

package de.mintware.barcode_scan;

public final class ScanResultOuterClass {
  private ScanResultOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  /**
   * Protobuf enum {@code de.mintware.barcode_scan.ResultType}
   */
  public enum ResultType
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>Barcode = 0;</code>
     */
    Barcode(0),
    /**
     * <code>Cancelled = 1;</code>
     */
    Cancelled(1),
    /**
     * <code>Error = 2;</code>
     */
    Error(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>Barcode = 0;</code>
     */
    public static final int Barcode_VALUE = 0;
    /**
     * <code>Cancelled = 1;</code>
     */
    public static final int Cancelled_VALUE = 1;
    /**
     * <code>Error = 2;</code>
     */
    public static final int Error_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResultType valueOf(int value) {
      return forNumber(value);
    }

    public static ResultType forNumber(int value) {
      switch (value) {
        case 0: return Barcode;
        case 1: return Cancelled;
        case 2: return Error;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ResultType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ResultType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ResultType>() {
            public ResultType findValueByNumber(int number) {
              return ResultType.forNumber(number);
            }
          };

    private final int value;

    private ResultType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:de.mintware.barcode_scan.ResultType)
  }

  public interface ScanResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:de.mintware.barcode_scan.ScanResult)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Represents the type of the result
     * </pre>
     *
     * <code>optional .de.mintware.barcode_scan.ResultType type = 1;</code>
     */
    int getTypeValue();
    /**
     * <pre>
     * Represents the type of the result
     * </pre>
     *
     * <code>optional .de.mintware.barcode_scan.ResultType type = 1;</code>
     */
    de.mintware.barcode_scan.ScanResultOuterClass.ResultType getType();

    /**
     * <pre>
     * The barcode itself if the result type is barcode.
     * If the result type is error it contains the error message
     * </pre>
     *
     * <code>optional string rawContent = 2;</code>
     */
    java.lang.String getRawContent();
    /**
     * <pre>
     * The barcode itself if the result type is barcode.
     * If the result type is error it contains the error message
     * </pre>
     *
     * <code>optional string rawContent = 2;</code>
     */
    com.google.protobuf.ByteString
        getRawContentBytes();

    /**
     * <pre>
     * The barcode format
     * </pre>
     *
     * <code>optional .de.mintware.barcode_scan.BarcodeFormat format = 3;</code>
     */
    int getFormatValue();
    /**
     * <pre>
     * The barcode format
     * </pre>
     *
     * <code>optional .de.mintware.barcode_scan.BarcodeFormat format = 3;</code>
     */
    de.mintware.barcode_scan.BarcodeFormatOuterClass.BarcodeFormat getFormat();

    /**
     * <pre>
     * If the format is unknown, this field holds additional information
     * </pre>
     *
     * <code>optional string formatNote = 4;</code>
     */
    java.lang.String getFormatNote();
    /**
     * <pre>
     * If the format is unknown, this field holds additional information
     * </pre>
     *
     * <code>optional string formatNote = 4;</code>
     */
    com.google.protobuf.ByteString
        getFormatNoteBytes();
  }
  /**
   * Protobuf type {@code de.mintware.barcode_scan.ScanResult}
   */
  public  static final class ScanResult extends
      com.google.protobuf.GeneratedMessageLite<
          ScanResult, ScanResult.Builder> implements
      // @@protoc_insertion_point(message_implements:de.mintware.barcode_scan.ScanResult)
      ScanResultOrBuilder {
    private ScanResult() {
      rawContent_ = "";
      formatNote_ = "";
    }
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <pre>
     * Represents the type of the result
     * </pre>
     *
     * <code>optional .de.mintware.barcode_scan.ResultType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Represents the type of the result
     * </pre>
     *
     * <code>optional .de.mintware.barcode_scan.ResultType type = 1;</code>
     */
    public de.mintware.barcode_scan.ScanResultOuterClass.ResultType getType() {
      de.mintware.barcode_scan.ScanResultOuterClass.ResultType result = de.mintware.barcode_scan.ScanResultOuterClass.ResultType.forNumber(type_);
      return result == null ? de.mintware.barcode_scan.ScanResultOuterClass.ResultType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Represents the type of the result
     * </pre>
     *
     * <code>optional .de.mintware.barcode_scan.ResultType type = 1;</code>
     */
    private void setTypeValue(int value) {
        type_ = value;
    }
    /**
     * <pre>
     * Represents the type of the result
     * </pre>
     *
     * <code>optional .de.mintware.barcode_scan.ResultType type = 1;</code>
     */
    private void setType(de.mintware.barcode_scan.ScanResultOuterClass.ResultType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
    }
    /**
     * <pre>
     * Represents the type of the result
     * </pre>
     *
     * <code>optional .de.mintware.barcode_scan.ResultType type = 1;</code>
     */
    private void clearType() {
      
      type_ = 0;
    }

    public static final int RAWCONTENT_FIELD_NUMBER = 2;
    private java.lang.String rawContent_;
    /**
     * <pre>
     * The barcode itself if the result type is barcode.
     * If the result type is error it contains the error message
     * </pre>
     *
     * <code>optional string rawContent = 2;</code>
     */
    public java.lang.String getRawContent() {
      return rawContent_;
    }
    /**
     * <pre>
     * The barcode itself if the result type is barcode.
     * If the result type is error it contains the error message
     * </pre>
     *
     * <code>optional string rawContent = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRawContentBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(rawContent_);
    }
    /**
     * <pre>
     * The barcode itself if the result type is barcode.
     * If the result type is error it contains the error message
     * </pre>
     *
     * <code>optional string rawContent = 2;</code>
     */
    private void setRawContent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rawContent_ = value;
    }
    /**
     * <pre>
     * The barcode itself if the result type is barcode.
     * If the result type is error it contains the error message
     * </pre>
     *
     * <code>optional string rawContent = 2;</code>
     */
    private void clearRawContent() {
      
      rawContent_ = getDefaultInstance().getRawContent();
    }
    /**
     * <pre>
     * The barcode itself if the result type is barcode.
     * If the result type is error it contains the error message
     * </pre>
     *
     * <code>optional string rawContent = 2;</code>
     */
    private void setRawContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rawContent_ = value.toStringUtf8();
    }

    public static final int FORMAT_FIELD_NUMBER = 3;
    private int format_;
    /**
     * <pre>
     * The barcode format
     * </pre>
     *
     * <code>optional .de.mintware.barcode_scan.BarcodeFormat format = 3;</code>
     */
    public int getFormatValue() {
      return format_;
    }
    /**
     * <pre>
     * The barcode format
     * </pre>
     *
     * <code>optional .de.mintware.barcode_scan.BarcodeFormat format = 3;</code>
     */
    public de.mintware.barcode_scan.BarcodeFormatOuterClass.BarcodeFormat getFormat() {
      de.mintware.barcode_scan.BarcodeFormatOuterClass.BarcodeFormat result = de.mintware.barcode_scan.BarcodeFormatOuterClass.BarcodeFormat.forNumber(format_);
      return result == null ? de.mintware.barcode_scan.BarcodeFormatOuterClass.BarcodeFormat.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The barcode format
     * </pre>
     *
     * <code>optional .de.mintware.barcode_scan.BarcodeFormat format = 3;</code>
     */
    private void setFormatValue(int value) {
        format_ = value;
    }
    /**
     * <pre>
     * The barcode format
     * </pre>
     *
     * <code>optional .de.mintware.barcode_scan.BarcodeFormat format = 3;</code>
     */
    private void setFormat(de.mintware.barcode_scan.BarcodeFormatOuterClass.BarcodeFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      format_ = value.getNumber();
    }
    /**
     * <pre>
     * The barcode format
     * </pre>
     *
     * <code>optional .de.mintware.barcode_scan.BarcodeFormat format = 3;</code>
     */
    private void clearFormat() {
      
      format_ = 0;
    }

    public static final int FORMATNOTE_FIELD_NUMBER = 4;
    private java.lang.String formatNote_;
    /**
     * <pre>
     * If the format is unknown, this field holds additional information
     * </pre>
     *
     * <code>optional string formatNote = 4;</code>
     */
    public java.lang.String getFormatNote() {
      return formatNote_;
    }
    /**
     * <pre>
     * If the format is unknown, this field holds additional information
     * </pre>
     *
     * <code>optional string formatNote = 4;</code>
     */
    public com.google.protobuf.ByteString
        getFormatNoteBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(formatNote_);
    }
    /**
     * <pre>
     * If the format is unknown, this field holds additional information
     * </pre>
     *
     * <code>optional string formatNote = 4;</code>
     */
    private void setFormatNote(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      formatNote_ = value;
    }
    /**
     * <pre>
     * If the format is unknown, this field holds additional information
     * </pre>
     *
     * <code>optional string formatNote = 4;</code>
     */
    private void clearFormatNote() {
      
      formatNote_ = getDefaultInstance().getFormatNote();
    }
    /**
     * <pre>
     * If the format is unknown, this field holds additional information
     * </pre>
     *
     * <code>optional string formatNote = 4;</code>
     */
    private void setFormatNoteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      formatNote_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (type_ != de.mintware.barcode_scan.ScanResultOuterClass.ResultType.Barcode.getNumber()) {
        output.writeEnum(1, type_);
      }
      if (!rawContent_.isEmpty()) {
        output.writeString(2, getRawContent());
      }
      if (format_ != de.mintware.barcode_scan.BarcodeFormatOuterClass.BarcodeFormat.unknown.getNumber()) {
        output.writeEnum(3, format_);
      }
      if (!formatNote_.isEmpty()) {
        output.writeString(4, getFormatNote());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != de.mintware.barcode_scan.ScanResultOuterClass.ResultType.Barcode.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (!rawContent_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getRawContent());
      }
      if (format_ != de.mintware.barcode_scan.BarcodeFormatOuterClass.BarcodeFormat.unknown.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, format_);
      }
      if (!formatNote_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getFormatNote());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static de.mintware.barcode_scan.ScanResultOuterClass.ScanResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static de.mintware.barcode_scan.ScanResultOuterClass.ScanResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static de.mintware.barcode_scan.ScanResultOuterClass.ScanResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static de.mintware.barcode_scan.ScanResultOuterClass.ScanResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static de.mintware.barcode_scan.ScanResultOuterClass.ScanResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static de.mintware.barcode_scan.ScanResultOuterClass.ScanResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static de.mintware.barcode_scan.ScanResultOuterClass.ScanResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static de.mintware.barcode_scan.ScanResultOuterClass.ScanResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static de.mintware.barcode_scan.ScanResultOuterClass.ScanResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static de.mintware.barcode_scan.ScanResultOuterClass.ScanResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(de.mintware.barcode_scan.ScanResultOuterClass.ScanResult prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code de.mintware.barcode_scan.ScanResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          de.mintware.barcode_scan.ScanResultOuterClass.ScanResult, Builder> implements
        // @@protoc_insertion_point(builder_implements:de.mintware.barcode_scan.ScanResult)
        de.mintware.barcode_scan.ScanResultOuterClass.ScanResultOrBuilder {
      // Construct using de.mintware.barcode_scan.ScanResultOuterClass.ScanResult.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * Represents the type of the result
       * </pre>
       *
       * <code>optional .de.mintware.barcode_scan.ResultType type = 1;</code>
       */
      public int getTypeValue() {
        return instance.getTypeValue();
      }
      /**
       * <pre>
       * Represents the type of the result
       * </pre>
       *
       * <code>optional .de.mintware.barcode_scan.ResultType type = 1;</code>
       */
      public Builder setTypeValue(int value) {
        copyOnWrite();
        instance.setTypeValue(value);
        return this;
      }
      /**
       * <pre>
       * Represents the type of the result
       * </pre>
       *
       * <code>optional .de.mintware.barcode_scan.ResultType type = 1;</code>
       */
      public de.mintware.barcode_scan.ScanResultOuterClass.ResultType getType() {
        return instance.getType();
      }
      /**
       * <pre>
       * Represents the type of the result
       * </pre>
       *
       * <code>optional .de.mintware.barcode_scan.ResultType type = 1;</code>
       */
      public Builder setType(de.mintware.barcode_scan.ScanResultOuterClass.ResultType value) {
        copyOnWrite();
        instance.setType(value);
        return this;
      }
      /**
       * <pre>
       * Represents the type of the result
       * </pre>
       *
       * <code>optional .de.mintware.barcode_scan.ResultType type = 1;</code>
       */
      public Builder clearType() {
        copyOnWrite();
        instance.clearType();
        return this;
      }

      /**
       * <pre>
       * The barcode itself if the result type is barcode.
       * If the result type is error it contains the error message
       * </pre>
       *
       * <code>optional string rawContent = 2;</code>
       */
      public java.lang.String getRawContent() {
        return instance.getRawContent();
      }
      /**
       * <pre>
       * The barcode itself if the result type is barcode.
       * If the result type is error it contains the error message
       * </pre>
       *
       * <code>optional string rawContent = 2;</code>
       */
      public com.google.protobuf.ByteString
          getRawContentBytes() {
        return instance.getRawContentBytes();
      }
      /**
       * <pre>
       * The barcode itself if the result type is barcode.
       * If the result type is error it contains the error message
       * </pre>
       *
       * <code>optional string rawContent = 2;</code>
       */
      public Builder setRawContent(
          java.lang.String value) {
        copyOnWrite();
        instance.setRawContent(value);
        return this;
      }
      /**
       * <pre>
       * The barcode itself if the result type is barcode.
       * If the result type is error it contains the error message
       * </pre>
       *
       * <code>optional string rawContent = 2;</code>
       */
      public Builder clearRawContent() {
        copyOnWrite();
        instance.clearRawContent();
        return this;
      }
      /**
       * <pre>
       * The barcode itself if the result type is barcode.
       * If the result type is error it contains the error message
       * </pre>
       *
       * <code>optional string rawContent = 2;</code>
       */
      public Builder setRawContentBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setRawContentBytes(value);
        return this;
      }

      /**
       * <pre>
       * The barcode format
       * </pre>
       *
       * <code>optional .de.mintware.barcode_scan.BarcodeFormat format = 3;</code>
       */
      public int getFormatValue() {
        return instance.getFormatValue();
      }
      /**
       * <pre>
       * The barcode format
       * </pre>
       *
       * <code>optional .de.mintware.barcode_scan.BarcodeFormat format = 3;</code>
       */
      public Builder setFormatValue(int value) {
        copyOnWrite();
        instance.setFormatValue(value);
        return this;
      }
      /**
       * <pre>
       * The barcode format
       * </pre>
       *
       * <code>optional .de.mintware.barcode_scan.BarcodeFormat format = 3;</code>
       */
      public de.mintware.barcode_scan.BarcodeFormatOuterClass.BarcodeFormat getFormat() {
        return instance.getFormat();
      }
      /**
       * <pre>
       * The barcode format
       * </pre>
       *
       * <code>optional .de.mintware.barcode_scan.BarcodeFormat format = 3;</code>
       */
      public Builder setFormat(de.mintware.barcode_scan.BarcodeFormatOuterClass.BarcodeFormat value) {
        copyOnWrite();
        instance.setFormat(value);
        return this;
      }
      /**
       * <pre>
       * The barcode format
       * </pre>
       *
       * <code>optional .de.mintware.barcode_scan.BarcodeFormat format = 3;</code>
       */
      public Builder clearFormat() {
        copyOnWrite();
        instance.clearFormat();
        return this;
      }

      /**
       * <pre>
       * If the format is unknown, this field holds additional information
       * </pre>
       *
       * <code>optional string formatNote = 4;</code>
       */
      public java.lang.String getFormatNote() {
        return instance.getFormatNote();
      }
      /**
       * <pre>
       * If the format is unknown, this field holds additional information
       * </pre>
       *
       * <code>optional string formatNote = 4;</code>
       */
      public com.google.protobuf.ByteString
          getFormatNoteBytes() {
        return instance.getFormatNoteBytes();
      }
      /**
       * <pre>
       * If the format is unknown, this field holds additional information
       * </pre>
       *
       * <code>optional string formatNote = 4;</code>
       */
      public Builder setFormatNote(
          java.lang.String value) {
        copyOnWrite();
        instance.setFormatNote(value);
        return this;
      }
      /**
       * <pre>
       * If the format is unknown, this field holds additional information
       * </pre>
       *
       * <code>optional string formatNote = 4;</code>
       */
      public Builder clearFormatNote() {
        copyOnWrite();
        instance.clearFormatNote();
        return this;
      }
      /**
       * <pre>
       * If the format is unknown, this field holds additional information
       * </pre>
       *
       * <code>optional string formatNote = 4;</code>
       */
      public Builder setFormatNoteBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setFormatNoteBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:de.mintware.barcode_scan.ScanResult)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new de.mintware.barcode_scan.ScanResultOuterClass.ScanResult();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          de.mintware.barcode_scan.ScanResultOuterClass.ScanResult other = (de.mintware.barcode_scan.ScanResultOuterClass.ScanResult) arg1;
          type_ = visitor.visitInt(type_ != 0, type_,    other.type_ != 0, other.type_);
          rawContent_ = visitor.visitString(!rawContent_.isEmpty(), rawContent_,
              !other.rawContent_.isEmpty(), other.rawContent_);
          format_ = visitor.visitInt(format_ != 0, format_,    other.format_ != 0, other.format_);
          formatNote_ = visitor.visitString(!formatNote_.isEmpty(), formatNote_,
              !other.formatNote_.isEmpty(), other.formatNote_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 8: {
                  int rawValue = input.readEnum();

                  type_ = rawValue;
                  break;
                }
                case 18: {
                  String s = input.readStringRequireUtf8();

                  rawContent_ = s;
                  break;
                }
                case 24: {
                  int rawValue = input.readEnum();

                  format_ = rawValue;
                  break;
                }
                case 34: {
                  String s = input.readStringRequireUtf8();

                  formatNote_ = s;
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (de.mintware.barcode_scan.ScanResultOuterClass.ScanResult.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:de.mintware.barcode_scan.ScanResult)
    private static final de.mintware.barcode_scan.ScanResultOuterClass.ScanResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ScanResult();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static de.mintware.barcode_scan.ScanResultOuterClass.ScanResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ScanResult> PARSER;

    public static com.google.protobuf.Parser<ScanResult> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}