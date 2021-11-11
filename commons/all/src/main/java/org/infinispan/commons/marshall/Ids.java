package org.infinispan.commons.marshall;

/**
 * Internal marshalling identifiers.
 *
 * @author Galder Zamarreño
 * @since 6.0
 */
public interface Ids {

   // No internal externalizer should use this upper limit Id or anything higher than that.
   int MAX_ID = 255;

   Integer MAPS = 1;
   Integer COLLECTIONS = 2;

   // responses
   Integer SUCCESSFUL_RESPONSE = 4;
   Integer EXCEPTION_RESPONSE = 5;
   Integer UNSUCCESSFUL_RESPONSE = 6;

   // entries and values
   Integer IMMORTAL_ENTRY = 7;
   Integer MORTAL_ENTRY = 8;
   Integer TRANSIENT_ENTRY = 9;
   Integer TRANSIENT_MORTAL_ENTRY = 10;
   Integer IMMORTAL_VALUE = 11;
   Integer MORTAL_VALUE = 12;
   Integer TRANSIENT_VALUE = 13;
   Integer TRANSIENT_MORTAL_VALUE = 14;

   Integer INT_SUMMARY_STATISTICS = 16;
   Integer LONG_SUMMARY_STATISTICS = 17;
   Integer DOUBLE_SUMMARY_STATISTICS = 18;

   Integer GLOBAL_TRANSACTION = 19;
   Integer JGROUPS_ADDRESS = 20;
   Integer WRAPPED_BYTE_ARRAY = 21;

   Integer DEADLOCK_DETECTING_GLOBAL_TRANSACTION = 22;

   Integer DEFAULT_CONSISTENT_HASH = 27;
   Integer REPLICATED_CONSISTENT_HASH = 28;
   Integer UNSURE_RESPONSE = 29;

   Integer JGROUPS_TOPOLOGY_AWARE_ADDRESS = 30;
   Integer REPLICABLE_COMMAND = 31;

   Integer XID = 32;
   Integer XID_DEADLOCK_DETECTING_GLOBAL_TRANSACTION = 33;
   Integer XID_GLOBAL_TRANSACTION = 34;

   Integer IN_DOUBT_TX_INFO = 35;

   Integer CACHE_RPC_COMMAND = 36;

   Integer CACHE_TOPOLOGY = 37;

   // Metadata entries and values
   Integer METADATA_IMMORTAL_ENTRY = 38;
   Integer METADATA_MORTAL_ENTRY = 39;
   Integer METADATA_TRANSIENT_ENTRY = 40;
   Integer METADATA_TRANSIENT_MORTAL_ENTRY = 41;
   Integer METADATA_IMMORTAL_VALUE = 42;
   Integer METADATA_MORTAL_VALUE = 43;
   Integer METADATA_TRANSIENT_VALUE = 44;
   Integer METADATA_TRANSIENT_MORTAL_VALUE = 45;

   Integer TRANSACTION_INFO = 46;

   Integer FLAG = 47;

   Integer STATE_CHUNK = 48;
   Integer CACHE_JOIN_INFO = 49;

   Integer DEFAULT_CONSISTENT_HASH_FACTORY = 50;
   Integer REPLICATED_CONSISTENT_HASH_FACTORY = 51;
   Integer SYNC_CONSISTENT_HASH_FACTORY = 52;
   Integer TOPOLOGY_AWARE_CONSISTENT_HASH_FACTORY = 53;
   Integer TOPOLOGY_AWARE_SYNC_CONSISTENT_HASH_FACTORY = 54;
   Integer SIMPLE_CLUSTERED_VERSION = 55;
   Integer DELTA_COMPOSITE_KEY = 56;

   Integer EMBEDDED_METADATA = 57;

   Integer NUMERIC_VERSION = 58;

   Integer CACHE_NOT_FOUND_RESPONSE = 59;
   Integer KEY_VALUE_PAIR_ID = 60;
   Integer INTERNAL_METADATA_ID = 61;
   Integer MARSHALLED_ENTRY_ID = 62;

   Integer ENUM_SET_ID = 63;

   Integer SIMPLE_COLLECTION_KEY_FILTER = 64;
   Integer KEY_FILTER_AS_KEY_VALUE_FILTER = 65;
   Integer CLUSTER_EVENT = 66;
   Integer CLUSTER_LISTENER_REMOVE_CALLABLE = 67;
   Integer CLUSTER_LISTENER_REPLICATE_CALLABLE = 68;
   // 69 unused
   Integer X_SITE_STATE = 70;
   Integer COMPOSITE_KEY_VALUE_FILTER = 71;
   Integer CACHE_STATUS_RESPONSE = 72;
   Integer CACHE_EVENT_CONVERTER_AS_CONVERTER = 73;
   Integer CACHE_EVENT_FILTER_AS_KEY_VALUE_FILTER = 74;
   Integer CACHE_EVENT_FILTER_CONVERTER_AS_KEY_VALUE_FILTER_CONVERTER = 75;
   Integer KEY_FILTER_AS_CACHE_EVENT_FILTER = 76;
   Integer KEY_VALUE_FILTER_AS_CACHE_EVENT_FILTER = 77;
   Integer ACCEPT_ALL_KEY_VALUE_FILTER = 78;
   Integer COMPOSITE_KEY_FILTER = 79;
   Integer KEY_VALUE_FILTER_AS_KEY_FILTER = 80;
   Integer MANAGER_STATUS_RESPONSE = 81;
   // 82 unused

   Integer EQUIVALENCE = 83;

   Integer INTERMEDIATE_OPERATIONS = 84;
   Integer TERMINAL_OPERATIONS = 85;
   Integer STREAM_MARSHALLING = 86;

   Integer CACHE_FILTERS = 87;

   Integer OPTIONAL = 88;

   Integer META_PARAMS_INTERNAL_METADATA = 89;

   // TODO: Add other meta params
   Integer META_LIFESPAN = 91;
   Integer META_ENTRY_VERSION = 92;
   Integer META_MAX_IDLE = 93;

   Integer READ_WRITE_SNAPSHOT_VIEW = 94;

   Integer AVAILABILITY_MODE = 95;

   Integer SYNC_REPLICATED_CONSISTENT_HASH_FACTORY = 96;

   Integer PERSISTENT_UUID = 97;

   Integer READ_ONLY_SNAPSHOT_VIEW = 98;
   Integer NO_VALUE_READ_ONLY_VIEW = 99;

   Integer MIME_CACHE_ENTRY = 100;
   Integer UUID = 101;

   Integer QUEUE = 102;
   Integer ARRAYS = 103;

   Integer MURMURHASH_3 = 104;

   Integer IMMUTABLE_MAP = 105;
   Integer BYTE_BUFFER = 106;

   // Functional lambdas
   Integer LAMBDA_CONSTANT = 107;
   Integer LAMBDA_SET_VALUE_IF_EQUALS_RETURN_BOOLEAN = 108;
   Integer LAMBDA_WITH_METAS = 109;

   Integer IMMUTABLE_SET = 110;

   Integer STREAM_ITERATOR_RESPONSE = 111;
   Integer END_ITERATOR = 112;

   Integer STREAM_MAP_OPS = 113;

   Integer TRIANGLE_ACK_EXTERNALIZER = 114;

   Integer VERSIONED_RESULT = 115;
   Integer VERSIONED_RESULTS = 116;

   Integer APPLY_DELTA = 117;

   Integer XID_IMPL = 118;

   Integer ATOMIC_MAP_FUNCTIONS = 119;
   Integer ATOMIC_KEY_SET = 120;
   Integer ATOMIC_FINE_GRAINED_MAP_FUNCTIONS = 121;

   Integer ENCODER_KEY_MAPPER = 122;
   Integer ENCODER_VALUE_MAPPER = 123;
   Integer ENCODER_ENTRY_MAPPER = 124;

   Integer FUNCTION_MAPPER = 125;
   Integer BI_FUNCTION_MAPPER = 126;

   Integer SCATTERED_CONSISTENT_HASH_FACTORY = 127;
   Integer SCATTERED_CONSISTENT_HASH = 128;
   Integer METADATA_REMOTE = 129;

   Integer MERGE_FUNCTION_MAPPER = 130;

   Integer DATA_CONVERSION = 131;

   Integer INT_SET = 132;

   Integer SCOPED_STATE = 133;
   Integer SCOPED_STATE_FILTER = 134;
   Integer ADMIN_FLAG = 135;
   Integer CACHE_STATE = 136;

   Integer STATS_ENVELOPE = 137;
   Integer BIAS_REVOCATION_RESPONSE = 138;

   Integer KEY_VALUE_FILTER_CONVERTER_AS_CACHE_EVENT_FILTER_CONVERTER = 139;

   Integer SIMPLE_PUBLISHER_RESULT = 140;
   Integer PUBLISHER_REDUCERS = 141;

   Integer CACHE_STREAM_INTERMEDIATE_PUBLISHER = 142;

   Integer CACHE_STREAM_INTERMEDIATE_REDUCER = 143;

   Integer CLASS = 144;
   Integer DISTRIBUTED_CACHE_STATS_CALLABLE = 145;
   Integer EXCEPTIONS = 146;
   Integer IMMUTABLE_LIST_COPY = 147;
   Integer INTERNAL_ENUMS = 148;

   Integer PUBLISHER_RESPONSE = 149;
   Integer CACHE_BI_CONSUMERS = 150;

   Integer PUBLISHER_TRANSFORMERS = 151;
   Integer PREPARE_RESPONSE = 152;

   Integer XSITE_AUTO_TRANSFER_RESPONSE = 153;

   Integer COUNTER_CONFIGURATION = 2000; //from counter
   Integer COUNTER_STATE = 2001; //from counter
}
