package com.bestna39.exam.springavronetty.service;

import com.bestna39.exam.springavronetty.protocol.CalculatorAdd;
import org.apache.avro.AvroRemoteException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorAddImpl implements CalculatorAdd {
    @Override
    public double add(double x, double y) throws AvroRemoteException {
        return x + y;
    }
}
