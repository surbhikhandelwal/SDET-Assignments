package com.base.driverUtils;


public class DriverProvider {

	public IDriver getDriver(String typeOfDriverExecution){
		if (typeOfDriverExecution != null) {
			switch (typeOfDriverExecution) {
				case "local":
					return new LocalDriver();
				case "remote":
					return new RemoteDriver();
				default:
					return new LocalDriver();
			}
		} else {
			return null;
		}
	}
}

