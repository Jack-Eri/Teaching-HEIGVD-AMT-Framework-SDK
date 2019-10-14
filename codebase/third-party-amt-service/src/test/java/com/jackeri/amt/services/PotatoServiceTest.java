package com.jackeri.amt.services;

import ch.heigvd.amt.framework.api.ServiceTest;
import ch.heigvd.amt.framework.exceptions.InvalidOperationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PotatoServiceTest extends ServiceTest {

  @BeforeEach
  void setupService() {
    service = new PotatoService();
  }

  @Test
  void itShouldProvideAPotatoSpeechOperation() throws InvalidOperationException {
    String value = service.execute(PotatoService.OPERATION_POTATO, null);
    assertNotNull(value);
  }

}