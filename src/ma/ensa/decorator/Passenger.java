package ma.ensa.decorator;

import ma.ensa.baseTrain.TrainAbs;

public class Passenger extends Train {

	public Passenger(TrainAbs trainAbs) {
		super(trainAbs);
	}

	@Override
	public String getDescription() {
		return trainAbs.getDescription() + trainAbs.getConnector() + "|OOOO|";
	}

	@Override
	public String getConnector() {

		return "::";
	}
}
