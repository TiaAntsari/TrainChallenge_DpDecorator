package ma.ensa.decorator;

import ma.ensa.baseTrain.TrainAbs;

public class Loaded extends Train {

	public Loaded(TrainAbs trainAbs) {
		super(trainAbs);
	}

	@Override
	public String getDescription() {
		return trainAbs.getDescription() + trainAbs.getConnector() + "|^^^^|";
	}

	@Override
	public String getConnector() {

		return "::";
	}
}
