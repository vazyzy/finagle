target(name='scala',
  dependencies=[
    ':client',
    ':defaultloader',
    ':serversets'
  ]
)

target(name='core',
  dependencies=[
    'science/src/java/com/twitter/common/zookeeper:client',
    'science/src/java/com/twitter/common/zookeeper:server-set',
    'science/src/java/com/twitter/common/io:io',
    'science/src/java/com/twitter/common/quantity:quantity',
    '3rdparty/jvm/org/apache/zookeeper:zookeeper-server',
    '3rdparty/jvm/junit',
    '3rdparty/jvm/org/mockito:mockito-all',
    '3rdparty/jvm/org/scalatest',
    'finagle/finagle-core',
    'finagle/finagle-serversets',
    'util/util-core',
    'util/util-zk-test'
  ],
)

junit_tests(name='defaultloader',
  dependencies=[':core', '3rdparty/jvm/junit:junit', '3rdparty/jvm/org/apache/zookeeper:zookeeper-server', '3rdparty/jvm/org/mockito:mockito-all', '3rdparty/jvm/org/scalatest:scalatest', 'finagle/finagle-core/src/main/scala:scala', 'finagle/finagle-serversets/src/main/scala:scala', 'util/util-core/src/main/scala:scala', 'util/util-stats/src/main/scala:scala'],
  sources=globs('com/twitter/finagle/serverset2/client/apache/*.scala')
)

junit_tests(name='client',
  dependencies=[':core', '3rdparty/jvm/junit:junit', '3rdparty/jvm/org/mockito:mockito-all', '3rdparty/jvm/org/scalatest:scalatest', 'finagle/finagle-serversets/src/main/scala:scala', 'util/util-core/src/main/scala:scala', 'util/util-stats/src/main/scala:scala'],
  fatal_warnings=True,
  sources=globs('com/twitter/finagle/serverset2/client/*.scala')
)

junit_tests(name='serversets',
  dependencies=[':core', '3rdparty/jvm/com/google/guava:guava', '3rdparty/jvm/com/google/inject:guice', '3rdparty/jvm/junit:junit', '3rdparty/jvm/org/apache/zookeeper:zookeeper-server', '3rdparty/jvm/org/mockito:mockito-all', '3rdparty/jvm/org/scalatest:scalatest', 'finagle/finagle-core/src/main/scala:scala', 'finagle/finagle-serversets/src/main/scala:scala', 'science/src/java/com/twitter/common/io:io', 'science/src/java/com/twitter/common/io:json', 'science/src/java/com/twitter/common/net:dynamic-host-set', 'science/src/java/com/twitter/common/quantity:quantity', 'science/src/java/com/twitter/common/zookeeper:client', 'science/src/java/com/twitter/common/zookeeper:server-set', 'science/src/thrift/com/twitter/thrift:thrift-java', 'util/util-core/src/main/scala:scala', 'util/util-stats/src/main/scala:scala', 'util/util-zk-test/src/main/scala:scala'],
  resources=[
    'finagle/finagle-serversets/src/test/resources'
  ],
  sources=globs(
    'com/twitter/finagle/*.scala',
    'com/twitter/finagle/serverset2/*.scala',
    'com/twitter/finagle/serverset2/addr/*.scala',
    'com/twitter/finagle/serverset2/naming/*.scala',
    'com/twitter/finagle/zookeeper/*.scala',
  ),
  known_to_fail="TRFC-679",
)
