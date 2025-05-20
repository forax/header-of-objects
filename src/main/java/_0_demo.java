class _0_demo {
  public static void main(String[] args) {
    Object object = new Object();

    System.out.println(object.getClass());

    System.out.println(Integer.toHexString(object.hashCode()));
    System.out.println(Integer.toHexString(object.hashCode()));

    System.out.println(Thread.holdsLock(object));
  }
}
