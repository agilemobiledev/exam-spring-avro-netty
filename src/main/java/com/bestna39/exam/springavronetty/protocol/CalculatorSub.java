/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.bestna39.exam.springavronetty.protocol;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface CalculatorSub {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"CalculatorSub\",\"namespace\":\"com.bestna39.exam.springavronetty.protocol\",\"types\":[],\"messages\":{\"subtract\":{\"request\":[{\"name\":\"x\",\"type\":\"double\"},{\"name\":\"y\",\"type\":\"double\"}],\"response\":\"double\"}}}");
  double subtract(double x, double y) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends CalculatorSub {
    public static final org.apache.avro.Protocol PROTOCOL = com.bestna39.exam.springavronetty.protocol.CalculatorSub.PROTOCOL;
    void subtract(double x, double y, org.apache.avro.ipc.Callback<java.lang.Double> callback) throws java.io.IOException;
  }
}