package com.ethan.projects.plus.simulator;

public class PlusSimulator {

	//time interval to collect plus data, default is 0.1 second;
	private int heartBeat = 100; 
	
	private int startPlus;
	
	private int endPlus;
	
	//it is the time from start plus to endPlus in second;
	private int duration;
	
	
	public PlusSimulator(int heartBeat, int startPlus, int endPlus, int duration) {
		super();
		this.heartBeat = heartBeat;
		this.startPlus = startPlus;
		this.endPlus = endPlus;
		this.duration = duration;
	}

	public PlusSimulator() {
		this(100, 60, 120, 10);
	}
	
	public void execute() {
		int totalCount;
		//start phase
		System.out.println("start phase");
		boolean flag = true;
		while(flag) {
			sleep();
			
		}
		
		System.out.println("esclation phase");
		
	}
	
	private void sleep() {
		try {
			Thread.sleep(heartBeat);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
