package com.sutaruhin;

import java.time.LocalDate;
import java.time.DayOfWeek;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

	//http://localhost:8080/dayofweek/指定日 （形式：/yyyy/mm/dd）
	@GetMapping("/dayofweek/{yyyy}/{mm}/{dd}")
	public String dispDayOfWeek(@PathVariable int yyyy, @PathVariable int mm, @PathVariable int dd) {

	    LocalDate dateInput = LocalDate.of(yyyy, mm, dd);

	    DayOfWeek dayOfWeek = dateInput.getDayOfWeek();

	    return dayOfWeek.toString();
	}


	//http://localhost:8080/plus/数値1/数値2
	@GetMapping("/plus/{val1}/{val2}")
	public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 + val2;
		return "計算結果： " + res;
	}

	//http://localhost:8080/minus/数値1/数値2
	@GetMapping("/minus/{val1}/{val2}")
	public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 - val2;
		return "計算結果： " + res;
	}

	//http://localhost:8080/times/数値1/数値2
	@GetMapping("/times/{val1}/{val2}")
	public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 * val2;
		return "計算結果： " + res;
	}

	//http://localhost:8080/divide/数値1/数値2
	@GetMapping("/divide/{val1}/{val2}")
	public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 / val2;
		return "計算結果： " + res;
	}

}
