package com.jackeri.amt.services;

import ch.heigvd.amt.framework.api.IService;
import ch.heigvd.amt.framework.exceptions.InvalidOperationException;

import java.util.List;

public class PotatoService implements IService {
  public static final String SERVICE_NAME = "potatoService";
  public static final String OPERATION_POTATO = "potato";

  @Override
  public String execute(String operationName, List<String> parameterValues) throws InvalidOperationException {
    switch (operationName) {
      case OPERATION_POTATO:
        return "I am a potato! Do you like potatoes? You MUST!";
      default:
        throw new InvalidOperationException("Operation " + operationName + " is not valid.");
    }
  }

  @Override
  public String getHelpMessage() {
    return "service: " + this.getClass().getCanonicalName() + "\r\n"
      + " operation: " + OPERATION_POTATO + " (no arguments)";
  }
}
