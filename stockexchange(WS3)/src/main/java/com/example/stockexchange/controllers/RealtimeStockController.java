package com.example.stockexchange.controllers;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.stockexchange.services.RealTimeStockService;

@RestController
@RequestMapping(value="/stockexchangeservice/")

public class RealtimeStockController {
	
	@Autowired
	RealTimeStockService stockdataservice;
	
	 @GetMapping("monthly")
	 public JSONObject getMonthlyStocks(@RequestParam String symbol) throws org.json.simple.parser.ParseException {
		 return stockdataservice.getMonthlyData(symbol);
	 }
	
	
	
	 @GetMapping("weekly")
	 public JSONObject getWeeklyStocks(@RequestParam String symbol) throws org.json.simple.parser.ParseException {
		 return stockdataservice.getWeeklyData(symbol);
		 
	 }
	 
	 @GetMapping("daily")
	 public JSONObject getDailyStocks(@RequestParam String symbol) throws org.json.simple.parser.ParseException {
		 return stockdataservice.getDailyData(symbol);
	 }
	 
	 
	 
	 @GetMapping("intraday")
		public JSONObject getIntradayStocks(@RequestParam String symbol) throws org.json.simple.parser.ParseException{
		 
			return stockdataservice.getIntradayData(symbol);
		}
		
	 
	 @GetMapping("currentprice")
		public JSONObject getCurrentStockPrice(@RequestParam String symbol) throws org.json.simple.parser.ParseException{
			return stockdataservice.getCurrentPriceData(symbol);
	 }



}
