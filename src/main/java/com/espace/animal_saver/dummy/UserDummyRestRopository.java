package com.espace.animal_saver.dummy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "users-dummy", url = "")
public interface UserDummyRestRopository{
}
