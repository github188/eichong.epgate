package com.cooperate.TCEC.SGCC;


public class CheckTCECSGCCPushTask implements Runnable {

	@Override
	public void run() {
		TCECSGCCService.checkPushTimeout();
	}
}