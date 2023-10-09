package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Container implements InterfaceForContainerElementClass{

   public List<InterfaceForContainerElementClass> elements = new ArrayList<>();
   public Integer getElementSum() {
      AtomicReference<Integer> result = new AtomicReference<>(0);
      elements.forEach(interfaceForContainerElementClass -> {
         result.set(result.get() + interfaceForContainerElementClass.getElementSum());
      });
      return result.get();
   }
   public void add(InterfaceForContainerElementClass element){
      elements.add(element);
   }
}
