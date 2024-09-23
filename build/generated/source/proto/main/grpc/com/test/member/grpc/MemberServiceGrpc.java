package com.test.member.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: member.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MemberServiceGrpc {

  private MemberServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "MemberService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.test.member.grpc.MemberProto.MemberRequest,
      com.test.member.grpc.MemberProto.MemberCreateResponse> getCreateMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMember",
      requestType = com.test.member.grpc.MemberProto.MemberRequest.class,
      responseType = com.test.member.grpc.MemberProto.MemberCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.test.member.grpc.MemberProto.MemberRequest,
      com.test.member.grpc.MemberProto.MemberCreateResponse> getCreateMemberMethod() {
    io.grpc.MethodDescriptor<com.test.member.grpc.MemberProto.MemberRequest, com.test.member.grpc.MemberProto.MemberCreateResponse> getCreateMemberMethod;
    if ((getCreateMemberMethod = MemberServiceGrpc.getCreateMemberMethod) == null) {
      synchronized (MemberServiceGrpc.class) {
        if ((getCreateMemberMethod = MemberServiceGrpc.getCreateMemberMethod) == null) {
          MemberServiceGrpc.getCreateMemberMethod = getCreateMemberMethod =
              io.grpc.MethodDescriptor.<com.test.member.grpc.MemberProto.MemberRequest, com.test.member.grpc.MemberProto.MemberCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.member.grpc.MemberProto.MemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.member.grpc.MemberProto.MemberCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MemberServiceMethodDescriptorSupplier("CreateMember"))
              .build();
        }
      }
    }
    return getCreateMemberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MemberServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MemberServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MemberServiceStub>() {
        @java.lang.Override
        public MemberServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MemberServiceStub(channel, callOptions);
        }
      };
    return MemberServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MemberServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MemberServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MemberServiceBlockingStub>() {
        @java.lang.Override
        public MemberServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MemberServiceBlockingStub(channel, callOptions);
        }
      };
    return MemberServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MemberServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MemberServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MemberServiceFutureStub>() {
        @java.lang.Override
        public MemberServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MemberServiceFutureStub(channel, callOptions);
        }
      };
    return MemberServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createMember(com.test.member.grpc.MemberProto.MemberRequest request,
        io.grpc.stub.StreamObserver<com.test.member.grpc.MemberProto.MemberCreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMemberMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MemberService.
   */
  public static abstract class MemberServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MemberServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MemberService.
   */
  public static final class MemberServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MemberServiceStub> {
    private MemberServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MemberServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MemberServiceStub(channel, callOptions);
    }

    /**
     */
    public void createMember(com.test.member.grpc.MemberProto.MemberRequest request,
        io.grpc.stub.StreamObserver<com.test.member.grpc.MemberProto.MemberCreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMemberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MemberService.
   */
  public static final class MemberServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MemberServiceBlockingStub> {
    private MemberServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MemberServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MemberServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.test.member.grpc.MemberProto.MemberCreateResponse createMember(com.test.member.grpc.MemberProto.MemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMemberMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MemberService.
   */
  public static final class MemberServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MemberServiceFutureStub> {
    private MemberServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MemberServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MemberServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.member.grpc.MemberProto.MemberCreateResponse> createMember(
        com.test.member.grpc.MemberProto.MemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMemberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MEMBER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_MEMBER:
          serviceImpl.createMember((com.test.member.grpc.MemberProto.MemberRequest) request,
              (io.grpc.stub.StreamObserver<com.test.member.grpc.MemberProto.MemberCreateResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.test.member.grpc.MemberProto.MemberRequest,
              com.test.member.grpc.MemberProto.MemberCreateResponse>(
                service, METHODID_CREATE_MEMBER)))
        .build();
  }

  private static abstract class MemberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MemberServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.test.member.grpc.MemberProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MemberService");
    }
  }

  private static final class MemberServiceFileDescriptorSupplier
      extends MemberServiceBaseDescriptorSupplier {
    MemberServiceFileDescriptorSupplier() {}
  }

  private static final class MemberServiceMethodDescriptorSupplier
      extends MemberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MemberServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MemberServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MemberServiceFileDescriptorSupplier())
              .addMethod(getCreateMemberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
