import org.openjdk.jol.info.ClassLayout;

// -XX:+EnableDynamicAgentLoading
// -XX:-UseCompressedClassPointers -XX:-UseCompressedOops
// -XX:+UnlockExperimentalVMOptions -XX:+UseCompactObjectHeaders
// -Djdk.attach.allowAttachSelf
class _1_header {
  public static void main(String[] args) {
    ClassLayout classLayout = ClassLayout.parseClass(Object.class);
    //ClassLayout classLayout = ClassLayout.parseClass(Integer.class);
    //ClassLayout classLayout = ClassLayout.parseClass(String.class);

    System.out.println("header size " + classLayout.headerSize());

    System.out.println(classLayout.toPrintable());
  }
}
