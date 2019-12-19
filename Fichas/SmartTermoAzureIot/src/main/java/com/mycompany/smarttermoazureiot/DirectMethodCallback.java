/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.smarttermoazureiot;
import com.microsoft.azure.sdk.iot.device.*;
import com.microsoft.azure.sdk.iot.device.DeviceTwin.*;
import com.google.gson.Gson;

import java.io.*;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
/**
 *
 * @author Turma A
 */
class DirectMethodCallback implements DeviceMethodCallback
  {
    private void setTelemetryInterval(int interval)
    {
      System.out.println("Direct method # Setting telemetry interval (seconds): " + interval);
      telemetryInterval = interval * 1000;
    }

    @Override
    public DeviceMethodData call(String methodName, Object methodData, Object context)
    {
      DeviceMethodData deviceMethodData;
      String payload = new String((byte[])methodData);
      switch (methodName)
      {
        case "SetTelemetryInterval" :
        {
          int interval;
          try {
            int status = METHOD_SUCCESS;
            interval = Integer.parseInt(payload);
            System.out.println(payload);
            setTelemetryInterval(interval);
            deviceMethodData = new DeviceMethodData(status, "Executed direct method " + methodName);
          } catch (NumberFormatException e) {
            int status = INVALID_PARAMETER;
            deviceMethodData = new DeviceMethodData(status, "Invalid parameter " + payload);
          }
          break;
        }
        default:
        {
          int status = METHOD_NOT_DEFINED;
          deviceMethodData = new DeviceMethodData(status, "Not defined direct method " + methodName);
        }
      }
      return deviceMethodData;
    }
  }
