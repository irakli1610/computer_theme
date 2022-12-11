package computerTheme;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Interfaces.IEmail;
import Interfaces.IPowerOff;
import Interfaces.IReboot;
import Interfaces.ITurnonGameMode;

public abstract class Computer implements IReboot, IPowerOff,ITurnonGameMode,IEmail  {
	//---fields
	private CPU cpu;
	private FAN fan;
	private GPU gpu;
	private Keyboard keyboard;
	private Memory memory;
	private Monitor monitor;
	private MotherBoard motherboard;
	private PowerSupply powerSupply;
	private RAM ram;
	private User user;
	//---constructors
	public Computer() {
		super();
	}
	public Computer(CPU cpu, FAN fan, GPU gpu, Keyboard keyboard, Memory memory, Monitor monitor,
			MotherBoard motherboard,  PowerSupply powerSupply, RAM ram,User user) {
		super();
		this.cpu = cpu;
		this.fan = fan;
		this.gpu = gpu;
		this.keyboard = keyboard;
		this.memory = memory;
		this.monitor = monitor;
		this.motherboard = motherboard;
		this.powerSupply = powerSupply;
		this.ram = ram;
		this.user = user;
	}
	
	//---getters and setters
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public FAN getFan() {
		return fan;
	}
	public void setFan(FAN fan) {
		this.fan = fan;
	}
	public GPU getGpu() {
		return gpu;
	}
	public void setGpu(GPU gpu) {
		this.gpu = gpu;
	}
	public Keyboard getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	public Memory getMemory() {
		return memory;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public MotherBoard getMotherboard() {
		return motherboard;
	}
	public void setMotherboard(MotherBoard motherboard) {
		this.motherboard = motherboard;
	}
	public PowerSupply getPowerSupply() {
		return powerSupply;
	}
	public void setPowerSupply(PowerSupply powerSupply) {
		this.powerSupply = powerSupply;
	}
	public RAM getRam() {
		return ram;
	}
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	//---methods
	private final static Logger LOGGER = LogManager.getLogger(Laptop.class);

	public void emailSomeone(String message,User receiver) throws NullPointerException
	{
		if (user.getName()==null||receiver.getName()==null) {
			throw new NullPointerException();
		}else if(message ==null) {
			LOGGER.warn("your message is empty. see your message: "+message);
		}
		else {
		LOGGER.info("your message: "+message + " is sent to "+receiver.getName()+" from user: "+ user.getName());
		}
	}
	@Override
	public String toString() {
		return "\n" + cpu +  fan +  gpu + keyboard + memory  + monitor + motherboard + powerSupply+ ram  ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpu, fan, gpu, keyboard, memory, monitor, motherboard, powerSupply, ram);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		return Objects.equals(cpu, other.cpu) && Objects.equals(fan, other.fan) && Objects.equals(gpu, other.gpu)
				&& Objects.equals(keyboard, other.keyboard) && Objects.equals(memory, other.memory)
				&& Objects.equals(monitor, other.monitor) && Objects.equals(motherboard, other.motherboard)
				&& Objects.equals(powerSupply, other.powerSupply) && Objects.equals(ram, other.ram);
	}
	
	
	
	
	
}
