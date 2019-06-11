package com.ithome;

import com.ithome.util.PasswordUtil;
import org.junit.Test;

public class PasswordTest {

    @Test
    public void createPassword() throws Exception{
      String   encodePassword = PasswordUtil.encrypt("278495617", "root");
      System.out.println(encodePassword);
    }
}
