// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dummy_v1.proto

package org.datahem.protobuf.dummy.v1;

public final class DummyProto {
  private DummyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DummyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.datahem.proto.Dummy)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string Payload = 1;</code>
     */
    java.lang.String getPayload();
    /**
     * <code>optional string Payload = 1;</code>
     */
    com.google.protobuf.ByteString
        getPayloadBytes();

    /**
     * <code>optional int64 MessageInstant = 2;</code>
     */
    long getMessageInstant();

    /**
     * <code>optional string MessageUuid = 3;</code>
     */
    java.lang.String getMessageUuid();
    /**
     * <code>optional string MessageUuid = 3;</code>
     */
    com.google.protobuf.ByteString
        getMessageUuidBytes();
  }
  /**
   * Protobuf type {@code org.datahem.proto.Dummy}
   */
  public  static final class Dummy extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.datahem.proto.Dummy)
      DummyOrBuilder {
    // Use Dummy.newBuilder() to construct.
    private Dummy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Dummy() {
      payload_ = "";
      messageInstant_ = 0L;
      messageUuid_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Dummy(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              payload_ = s;
              break;
            }
            case 16: {

              messageInstant_ = input.readInt64();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              messageUuid_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.datahem.protobuf.dummy.v1.DummyProto.internal_static_org_datahem_proto_Dummy_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.datahem.protobuf.dummy.v1.DummyProto.internal_static_org_datahem_proto_Dummy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.datahem.protobuf.dummy.v1.DummyProto.Dummy.class, org.datahem.protobuf.dummy.v1.DummyProto.Dummy.Builder.class);
    }

    public static final int PAYLOAD_FIELD_NUMBER = 1;
    private volatile java.lang.Object payload_;
    /**
     * <code>optional string Payload = 1;</code>
     */
    public java.lang.String getPayload() {
      java.lang.Object ref = payload_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        payload_ = s;
        return s;
      }
    }
    /**
     * <code>optional string Payload = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPayloadBytes() {
      java.lang.Object ref = payload_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        payload_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGEINSTANT_FIELD_NUMBER = 2;
    private long messageInstant_;
    /**
     * <code>optional int64 MessageInstant = 2;</code>
     */
    public long getMessageInstant() {
      return messageInstant_;
    }

    public static final int MESSAGEUUID_FIELD_NUMBER = 3;
    private volatile java.lang.Object messageUuid_;
    /**
     * <code>optional string MessageUuid = 3;</code>
     */
    public java.lang.String getMessageUuid() {
      java.lang.Object ref = messageUuid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageUuid_ = s;
        return s;
      }
    }
    /**
     * <code>optional string MessageUuid = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMessageUuidBytes() {
      java.lang.Object ref = messageUuid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getPayloadBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, payload_);
      }
      if (messageInstant_ != 0L) {
        output.writeInt64(2, messageInstant_);
      }
      if (!getMessageUuidBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, messageUuid_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getPayloadBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, payload_);
      }
      if (messageInstant_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, messageInstant_);
      }
      if (!getMessageUuidBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, messageUuid_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.datahem.protobuf.dummy.v1.DummyProto.Dummy)) {
        return super.equals(obj);
      }
      org.datahem.protobuf.dummy.v1.DummyProto.Dummy other = (org.datahem.protobuf.dummy.v1.DummyProto.Dummy) obj;

      boolean result = true;
      result = result && getPayload()
          .equals(other.getPayload());
      result = result && (getMessageInstant()
          == other.getMessageInstant());
      result = result && getMessageUuid()
          .equals(other.getMessageUuid());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
      hash = (37 * hash) + MESSAGEINSTANT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMessageInstant());
      hash = (37 * hash) + MESSAGEUUID_FIELD_NUMBER;
      hash = (53 * hash) + getMessageUuid().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.datahem.protobuf.dummy.v1.DummyProto.Dummy parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.datahem.protobuf.dummy.v1.DummyProto.Dummy parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.datahem.protobuf.dummy.v1.DummyProto.Dummy parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.datahem.protobuf.dummy.v1.DummyProto.Dummy parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.datahem.protobuf.dummy.v1.DummyProto.Dummy parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.datahem.protobuf.dummy.v1.DummyProto.Dummy parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.datahem.protobuf.dummy.v1.DummyProto.Dummy parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.datahem.protobuf.dummy.v1.DummyProto.Dummy parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.datahem.protobuf.dummy.v1.DummyProto.Dummy parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.datahem.protobuf.dummy.v1.DummyProto.Dummy parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.datahem.protobuf.dummy.v1.DummyProto.Dummy prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.datahem.proto.Dummy}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.datahem.proto.Dummy)
        org.datahem.protobuf.dummy.v1.DummyProto.DummyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.datahem.protobuf.dummy.v1.DummyProto.internal_static_org_datahem_proto_Dummy_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.datahem.protobuf.dummy.v1.DummyProto.internal_static_org_datahem_proto_Dummy_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.datahem.protobuf.dummy.v1.DummyProto.Dummy.class, org.datahem.protobuf.dummy.v1.DummyProto.Dummy.Builder.class);
      }

      // Construct using org.datahem.protobuf.dummy.v1.DummyProto.Dummy.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        payload_ = "";

        messageInstant_ = 0L;

        messageUuid_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.datahem.protobuf.dummy.v1.DummyProto.internal_static_org_datahem_proto_Dummy_descriptor;
      }

      public org.datahem.protobuf.dummy.v1.DummyProto.Dummy getDefaultInstanceForType() {
        return org.datahem.protobuf.dummy.v1.DummyProto.Dummy.getDefaultInstance();
      }

      public org.datahem.protobuf.dummy.v1.DummyProto.Dummy build() {
        org.datahem.protobuf.dummy.v1.DummyProto.Dummy result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.datahem.protobuf.dummy.v1.DummyProto.Dummy buildPartial() {
        org.datahem.protobuf.dummy.v1.DummyProto.Dummy result = new org.datahem.protobuf.dummy.v1.DummyProto.Dummy(this);
        result.payload_ = payload_;
        result.messageInstant_ = messageInstant_;
        result.messageUuid_ = messageUuid_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.datahem.protobuf.dummy.v1.DummyProto.Dummy) {
          return mergeFrom((org.datahem.protobuf.dummy.v1.DummyProto.Dummy)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.datahem.protobuf.dummy.v1.DummyProto.Dummy other) {
        if (other == org.datahem.protobuf.dummy.v1.DummyProto.Dummy.getDefaultInstance()) return this;
        if (!other.getPayload().isEmpty()) {
          payload_ = other.payload_;
          onChanged();
        }
        if (other.getMessageInstant() != 0L) {
          setMessageInstant(other.getMessageInstant());
        }
        if (!other.getMessageUuid().isEmpty()) {
          messageUuid_ = other.messageUuid_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.datahem.protobuf.dummy.v1.DummyProto.Dummy parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.datahem.protobuf.dummy.v1.DummyProto.Dummy) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object payload_ = "";
      /**
       * <code>optional string Payload = 1;</code>
       */
      public java.lang.String getPayload() {
        java.lang.Object ref = payload_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          payload_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string Payload = 1;</code>
       */
      public com.google.protobuf.ByteString
          getPayloadBytes() {
        java.lang.Object ref = payload_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          payload_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string Payload = 1;</code>
       */
      public Builder setPayload(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        payload_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string Payload = 1;</code>
       */
      public Builder clearPayload() {
        
        payload_ = getDefaultInstance().getPayload();
        onChanged();
        return this;
      }
      /**
       * <code>optional string Payload = 1;</code>
       */
      public Builder setPayloadBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        payload_ = value;
        onChanged();
        return this;
      }

      private long messageInstant_ ;
      /**
       * <code>optional int64 MessageInstant = 2;</code>
       */
      public long getMessageInstant() {
        return messageInstant_;
      }
      /**
       * <code>optional int64 MessageInstant = 2;</code>
       */
      public Builder setMessageInstant(long value) {
        
        messageInstant_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 MessageInstant = 2;</code>
       */
      public Builder clearMessageInstant() {
        
        messageInstant_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object messageUuid_ = "";
      /**
       * <code>optional string MessageUuid = 3;</code>
       */
      public java.lang.String getMessageUuid() {
        java.lang.Object ref = messageUuid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          messageUuid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string MessageUuid = 3;</code>
       */
      public com.google.protobuf.ByteString
          getMessageUuidBytes() {
        java.lang.Object ref = messageUuid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          messageUuid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string MessageUuid = 3;</code>
       */
      public Builder setMessageUuid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        messageUuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string MessageUuid = 3;</code>
       */
      public Builder clearMessageUuid() {
        
        messageUuid_ = getDefaultInstance().getMessageUuid();
        onChanged();
        return this;
      }
      /**
       * <code>optional string MessageUuid = 3;</code>
       */
      public Builder setMessageUuidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        messageUuid_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:org.datahem.proto.Dummy)
    }

    // @@protoc_insertion_point(class_scope:org.datahem.proto.Dummy)
    private static final org.datahem.protobuf.dummy.v1.DummyProto.Dummy DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.datahem.protobuf.dummy.v1.DummyProto.Dummy();
    }

    public static org.datahem.protobuf.dummy.v1.DummyProto.Dummy getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Dummy>
        PARSER = new com.google.protobuf.AbstractParser<Dummy>() {
      public Dummy parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Dummy(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Dummy> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Dummy> getParserForType() {
      return PARSER;
    }

    public org.datahem.protobuf.dummy.v1.DummyProto.Dummy getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_datahem_proto_Dummy_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_datahem_proto_Dummy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016dummy_v1.proto\022\021org.datahem.proto\"E\n\005D" +
      "ummy\022\017\n\007Payload\030\001 \001(\t\022\026\n\016MessageInstant\030" +
      "\002 \001(\003\022\023\n\013MessageUuid\030\003 \001(\tB+\n\035org.datahe" +
      "m.protobuf.dummy.v1B\nDummyProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_org_datahem_proto_Dummy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_datahem_proto_Dummy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_datahem_proto_Dummy_descriptor,
        new java.lang.String[] { "Payload", "MessageInstant", "MessageUuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
