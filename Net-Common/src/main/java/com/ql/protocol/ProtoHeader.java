package com.ql.protocol;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_header.proto

public final class ProtoHeader {
  private ProtoHeader() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HeaderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Header)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 crcCode = 1;</code>
     * @return Whether the crcCode field is set.
     */
    boolean hasCrcCode();
    /**
     * <code>required int32 crcCode = 1;</code>
     * @return The crcCode.
     */
    int getCrcCode();

    /**
     * <code>required uint32 sessionId = 2;</code>
     * @return Whether the sessionId field is set.
     */
    boolean hasSessionId();
    /**
     * <code>required uint32 sessionId = 2;</code>
     * @return The sessionId.
     */
    int getSessionId();

    /**
     * <code>required bytes type = 3;</code>
     * @return Whether the type field is set.
     */
    boolean hasType();
    /**
     * <code>required bytes type = 3;</code>
     * @return The type.
     */
    com.google.protobuf.ByteString getType();
  }
  /**
   * Protobuf type {@code Header}
   */
  public static final class Header extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Header)
      HeaderOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Header.newBuilder() to construct.
    private Header(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Header() {
      type_ = com.google.protobuf.ByteString.EMPTY;
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new Header();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ProtoHeader.internal_static_Header_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ProtoHeader.internal_static_Header_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Header.class, Builder.class);
    }

    private int bitField0_;
    public static final int CRCCODE_FIELD_NUMBER = 1;
    private int crcCode_;
    /**
     * <code>required int32 crcCode = 1;</code>
     * @return Whether the crcCode field is set.
     */
    @Override
    public boolean hasCrcCode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int32 crcCode = 1;</code>
     * @return The crcCode.
     */
    @Override
    public int getCrcCode() {
      return crcCode_;
    }

    public static final int SESSIONID_FIELD_NUMBER = 2;
    private int sessionId_;
    /**
     * <code>required uint32 sessionId = 2;</code>
     * @return Whether the sessionId field is set.
     */
    @Override
    public boolean hasSessionId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required uint32 sessionId = 2;</code>
     * @return The sessionId.
     */
    @Override
    public int getSessionId() {
      return sessionId_;
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString type_;
    /**
     * <code>required bytes type = 3;</code>
     * @return Whether the type field is set.
     */
    @Override
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required bytes type = 3;</code>
     * @return The type.
     */
    @Override
    public com.google.protobuf.ByteString getType() {
      return type_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasCrcCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSessionId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt32(1, crcCode_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt32(2, sessionId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeBytes(3, type_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, crcCode_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, sessionId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, type_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Header)) {
        return super.equals(obj);
      }
      Header other = (Header) obj;

      if (hasCrcCode() != other.hasCrcCode()) return false;
      if (hasCrcCode()) {
        if (getCrcCode()
            != other.getCrcCode()) return false;
      }
      if (hasSessionId() != other.hasSessionId()) return false;
      if (hasSessionId()) {
        if (getSessionId()
            != other.getSessionId()) return false;
      }
      if (hasType() != other.hasType()) return false;
      if (hasType()) {
        if (!getType()
            .equals(other.getType())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasCrcCode()) {
        hash = (37 * hash) + CRCCODE_FIELD_NUMBER;
        hash = (53 * hash) + getCrcCode();
      }
      if (hasSessionId()) {
        hash = (37 * hash) + SESSIONID_FIELD_NUMBER;
        hash = (53 * hash) + getSessionId();
      }
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Header parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Header parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Header parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Header parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Header parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Header parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Header parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Header parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Header parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Header parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Header parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Header parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Header prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Header}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Header)
        HeaderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ProtoHeader.internal_static_Header_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ProtoHeader.internal_static_Header_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Header.class, Builder.class);
      }

      // Construct using ProtoHeader.Header.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @Override
      public Builder clear() {
        super.clear();
        crcCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        sessionId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ProtoHeader.internal_static_Header_descriptor;
      }

      @Override
      public Header getDefaultInstanceForType() {
        return Header.getDefaultInstance();
      }

      @Override
      public Header build() {
        Header result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Header buildPartial() {
        Header result = new Header(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.crcCode_ = crcCode_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.sessionId_ = sessionId_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Header) {
          return mergeFrom((Header)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Header other) {
        if (other == Header.getDefaultInstance()) return this;
        if (other.hasCrcCode()) {
          setCrcCode(other.getCrcCode());
        }
        if (other.hasSessionId()) {
          setSessionId(other.getSessionId());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!hasCrcCode()) {
          return false;
        }
        if (!hasSessionId()) {
          return false;
        }
        if (!hasType()) {
          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                crcCode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                sessionId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                type_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int crcCode_ ;
      /**
       * <code>required int32 crcCode = 1;</code>
       * @return Whether the crcCode field is set.
       */
      @Override
      public boolean hasCrcCode() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required int32 crcCode = 1;</code>
       * @return The crcCode.
       */
      @Override
      public int getCrcCode() {
        return crcCode_;
      }
      /**
       * <code>required int32 crcCode = 1;</code>
       * @param value The crcCode to set.
       * @return This builder for chaining.
       */
      public Builder setCrcCode(int value) {
        bitField0_ |= 0x00000001;
        crcCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 crcCode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCrcCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        crcCode_ = 0;
        onChanged();
        return this;
      }

      private int sessionId_ ;
      /**
       * <code>required uint32 sessionId = 2;</code>
       * @return Whether the sessionId field is set.
       */
      @Override
      public boolean hasSessionId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required uint32 sessionId = 2;</code>
       * @return The sessionId.
       */
      @Override
      public int getSessionId() {
        return sessionId_;
      }
      /**
       * <code>required uint32 sessionId = 2;</code>
       * @param value The sessionId to set.
       * @return This builder for chaining.
       */
      public Builder setSessionId(int value) {
        bitField0_ |= 0x00000002;
        sessionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 sessionId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSessionId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sessionId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString type_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes type = 3;</code>
       * @return Whether the type field is set.
       */
      @Override
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required bytes type = 3;</code>
       * @return The type.
       */
      @Override
      public com.google.protobuf.ByteString getType() {
        return type_;
      }
      /**
       * <code>required bytes type = 3;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Header)
    }

    // @@protoc_insertion_point(class_scope:Header)
    private static final Header DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Header();
    }

    public static Header getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<Header>
        PARSER = new com.google.protobuf.AbstractParser<Header>() {
      @Override
      public Header parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Header> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Header> getParserForType() {
      return PARSER;
    }

    @Override
    public Header getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Header_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Header_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\022proto_header.proto\":\n\006Header\022\017\n\007crcCod" +
      "e\030\001 \002(\005\022\021\n\tsessionId\030\002 \002(\r\022\014\n\004type\030\003 \002(\014"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Header_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Header_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Header_descriptor,
        new String[] { "CrcCode", "SessionId", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}