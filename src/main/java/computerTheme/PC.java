package computerTheme;

import java.util.Objects;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Exceptions.AlreadyInGameModeException;
import Exceptions.BooleanFormatException;
import Exceptions.InvalidInputException;
import Exceptions.NegativeInputException;
import Exceptions.NumberOutOfTopRange;

public final class PC extends Computer {
	// ---fields
	private HeadPhone headPhone;
	private Mouse mouse;
	private boolean isInGameMode;

	// ------constructors
	public PC(HeadPhone headPhone, Mouse mouse) {
		super();
		this.headPhone = headPhone;
		this.mouse = mouse;
	}

	public PC() {
	}

	public PC(CPU cpu, FAN fan, GPU gpu, Keyboard keyboard, Memory memory, Monitor monitor, MotherBoard motherBoard,
			PowerSupply pow, RAM ram, HeadPhone headPhone, Mouse mouse, User user) {
		super(cpu, fan, gpu, keyboard, memory, monitor, motherBoard, pow, ram, user);

		this.headPhone = headPhone;
		this.mouse = mouse;
	}

	// ---getters and setters
	public HeadPhone getHeadPhone() {
		return headPhone;
	}

	public void setHeadPhone(HeadPhone headPhone) {
		this.headPhone = headPhone;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public boolean isInGameMode() {
		return isInGameMode;
	}

	public void setInGameMode(boolean isInGameMode) {
		this.isInGameMode = isInGameMode;
	}

	// --------methods
	private final static Logger LOGGER = LogManager.getLogger(PC.class);

	@Override
	public void reboot() {
		LOGGER.info("your PC is rebooting");
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
				LOGGER.info("system in your PC will reboot after " + min + " minute and " + sec + " second");
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
					LOGGER.info("system in your PC will reboot after " + min + " minute and " + sec
							+ " second and apps will be restarted");
				} else {
					LOGGER.info("system in your PC will reboot after " + min + " minute and " + sec
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
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("do you really want to power off PC? type Y or N");
			String command = scanner.next().toUpperCase();
			if (command == null) {
				throw new NullPointerException();
			} else if (command != "Y" || command != "N") {
				throw new InvalidInputException();
			} else if (command == "Y") {
				LOGGER.info("system is powering off . pc is turning off");
			} else {
				LOGGER.info("system is not powering off . pc won't go off");
			}

		} catch (NullPointerException e) {
			LOGGER.error("invalid input");
		} catch (InvalidInputException e) {
			LOGGER.error("invalid input");
		}
	}

	@Override
	public final void turnonGameMode() {
		try {
			if (isInGameMode == true) {
				throw new AlreadyInGameModeException();
			} else {

				LOGGER.info("your pc is turning on game mode. fans are accelerating,system is getting ready");
			}
		} catch (AlreadyInGameModeException e) {
			LOGGER.error("PC is already in that state");
		}
	}

	@Override
	public String toString() {
		return "PC " + "\n" + headPhone + mouse + super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(headPhone, mouse);
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
		PC other = (PC) obj;
		return Objects.equals(headPhone, other.headPhone) && Objects.equals(mouse, other.mouse);
	}

}
