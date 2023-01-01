package computerTheme;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Exceptions.AlreadyFoldLaptopException;
import Exceptions.BooleanFormatException;
import Exceptions.NegativeInputException;
import Exceptions.NumberOutOfTopRange;
import Interfaces.IFold;

public final class Laptop extends Computer implements IFold {
	// ----fields
	private TouchPad touchPad;
	private Speaker speaker;
	public boolean isOpen;

	// ----constructors
	public Laptop(TouchPad touchPad, Speaker speaker) {
		super();
		this.touchPad = touchPad;
		this.speaker = speaker;
	}

	public Laptop() {
	}

	public Laptop(CPU cpu, FAN fan, GPU gpu, Keyboard keyboard, Memory memory, Monitor monitor, MotherBoard motherBoard,
			PowerSupply pow, RAM ram, TouchPad touchPad, Speaker speaker, User user) {
		super(cpu, fan, gpu, keyboard, memory, monitor, motherBoard, pow, ram, user);
		this.touchPad = touchPad;
		this.speaker = speaker;
	}

	// ------getters and setters
	public TouchPad getTouchPad() {
		return touchPad;
	}

	public void setTouchPad(TouchPad touchPad) {
		this.touchPad = touchPad;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	// ----methods
	private final static Logger LOGGER = LogManager.getLogger(Laptop.class);

	public void fold() {
		try {
			if (isOpen == false) {
				throw new AlreadyFoldLaptopException();
			} else {
				LOGGER.info("your laptop is folding");
			}
		} catch (AlreadyFoldLaptopException e) {
			LOGGER.error("you can't close the laptop that is already closed");
		} finally {
			LOGGER.info("laptop is closed");
		}
	}

	@Override
	public void reboot() {
		LOGGER.info("your laptop is rebooting");
	}

	@Override
	public void reboot(int min, int sec) {
		try {
			if (min < 0 || sec < 0) {
				throw new NegativeInputException();
			} else if (min != Integer.valueOf(min) || sec != Integer.valueOf(sec)) {
				throw new NumberFormatException();
			} else if (sec > 60) {
				throw new NumberOutOfTopRange();
			} else {
				LOGGER.info("system in your laptop will reboot after " + min + " minute and " + sec + " second");
			}
		} catch (NegativeInputException e) {
			LOGGER.error("you entered negative minute or second, please enter positive numbers");
		} catch (NumberFormatException e) {
			LOGGER.error("entered format is incorrect");
		} catch (NumberOutOfTopRange e) {
			LOGGER.error("your entered number is more than allowed number of seconds");
		}
	}

	@Override
	public void reboot(int min, int sec, boolean isRestartApps) {
		try {
			if (min < 0 || sec < 0) {
				throw new NegativeInputException();
			} else if (sec > 60) {
				throw new NumberOutOfTopRange();
			} else if (min != Integer.valueOf(min) || sec != Integer.valueOf(sec)) {
				throw new NumberFormatException();
			} else if (isRestartApps != true || isRestartApps != false) {
				throw new BooleanFormatException();
			} else {
				if (isRestartApps == true) {
					LOGGER.info("system in your laptop will reboot after " + min + " minute and " + sec
							+ " second and apps will be restarted");
				} else {
					LOGGER.info("system in your laptop will reboot after " + min + " minute and " + sec
							+ " second and apps won't be restarted");
				}
			}
		} catch (NegativeInputException e) {
			LOGGER.error("you entered negative minute or second, please enter positive numbers");
		} catch (NumberOutOfTopRange e) {
			LOGGER.error("your entered number is more than allowed number of seconds");
		} catch (NumberFormatException e) {
			LOGGER.error("entered format is incorrect");
		} catch (BooleanFormatException e) {
			LOGGER.error("boolean can only be either \"true\" or \"false\"");
		}
	}

	@Override
	public final void powerComputer() {
		System.out.println("system is powering on . laptop is turning on");
	}

	@Override
	public final void turnonGameMode() {
		System.out.println("your laptop is turning on game mode. fans are accelerating");
	}

	@Override
	public String toString() {
		return "PC " + "\n" + touchPad + speaker + super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(speaker, touchPad);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(speaker, other.speaker) && Objects.equals(touchPad, other.touchPad);
	}
}
