package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;
import com.devsuperior.dsmeta.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/sales")

public class SaleController {
        @Autowired

        private SaleService service;
    @Autowired
        private SmsService smsService;
    @GetMapping//tenq ser extamente aqui

        public Page<Sale> findSales(
                //filtro para trazer uma data max e min esta sendo colocado em texto porque na web os dados trafegan como texto
              @RequestParam(value= "minDate",defaultValue = "") String minDate,//se nao ouver parametro sera considerado vazio
              @RequestParam(value = "maxDate",defaultValue = "")  String maxDate,
                Pageable pageable){

        return service.findSales(minDate,maxDate,pageable );
        }
     @GetMapping("/{id}/notification")
        public void notifySms(@PathVariable Long id){
            smsService.sendSms(id);
        }
}
