package service;

import airtel.AirtelService;
import jio.JioService;

public class Factory {
	static Service run(int n) {
		switch (n) {
		case 1: {
			
			return new JioService();
		}
		case 2: {
			
			return new AirtelService();
		}
		
	}
		return null;
}
}
