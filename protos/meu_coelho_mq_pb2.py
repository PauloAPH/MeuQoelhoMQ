# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: protos/meu_coelho_mq.proto
# Protobuf Python Version: 5.26.1
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1aprotos/meu_coelho_mq.proto\x12\nrouteguide\"1\n\nSubscriber\x12\x12\n\nsubscriber\x18\x01 \x01(\x03\x12\x0f\n\x07\x63hannel\x18\x02 \x01(\t\"H\n\x07\x43hannel\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x1e\n\x04tipo\x18\x02 \x01(\x0e\x32\x10.routeguide.Tipo\x12\x0f\n\x07qtd_msg\x18\x03 \x01(\x05\"(\n\x07Message\x12\x0c\n\x04\x64\x61ta\x18\x01 \x01(\t\x12\x0f\n\x07\x63hannel\x18\x02 \x01(\t\"\x1c\n\x08Response\x12\x10\n\x08response\x18\x01 \x01(\t*!\n\x04Tipo\x12\x0b\n\x07SIMPLES\x10\x00\x12\x0c\n\x08MULTIPLO\x10\x01\x32\x98\x03\n\x0bMeuCoelhoMQ\x12<\n\rCreateChannel\x12\x13.routeguide.Channel\x1a\x14.routeguide.Response\"\x00\x12<\n\rDeleteChannel\x12\x13.routeguide.Channel\x1a\x14.routeguide.Response\"\x00\x12=\n\x0cListChannels\x12\x14.routeguide.Response\x1a\x13.routeguide.Channel\"\x00\x30\x01\x12=\n\x0ePublishMessage\x12\x13.routeguide.Message\x1a\x14.routeguide.Response\"\x00\x12\x44\n\x12SubscribeToChannel\x12\x16.routeguide.Subscriber\x1a\x14.routeguide.Response\"\x00\x12I\n\x17\x43onsultNumberOfMessages\x12\x16.routeguide.Subscriber\x1a\x14.routeguide.Response\"\x00\x42\x36\n\x1bio.grpc.examples.routeguideB\x0fRouteGuideProtoP\x01\xa2\x02\x03RTGb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'protos.meu_coelho_mq_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\033io.grpc.examples.routeguideB\017RouteGuideProtoP\001\242\002\003RTG'
  _globals['_TIPO']._serialized_start=239
  _globals['_TIPO']._serialized_end=272
  _globals['_SUBSCRIBER']._serialized_start=42
  _globals['_SUBSCRIBER']._serialized_end=91
  _globals['_CHANNEL']._serialized_start=93
  _globals['_CHANNEL']._serialized_end=165
  _globals['_MESSAGE']._serialized_start=167
  _globals['_MESSAGE']._serialized_end=207
  _globals['_RESPONSE']._serialized_start=209
  _globals['_RESPONSE']._serialized_end=237
  _globals['_MEUCOELHOMQ']._serialized_start=275
  _globals['_MEUCOELHOMQ']._serialized_end=683
# @@protoc_insertion_point(module_scope)
