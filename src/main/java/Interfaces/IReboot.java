package Interfaces;


public interface IReboot {
	public void reboot();

	public void reboot(int min, int sec) ;
	public void reboot(int min, int sec , boolean isRestartApps);
	
}
