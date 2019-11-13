package ma.ensa.decorator;

import ma.ensa.baseTrain.TrainAbs;

public abstract class Train extends TrainAbs {
	protected TrainAbs trainAbs;

	public Train(TrainAbs trainAbs) {
		super();
		this.trainAbs = trainAbs;
	}

	public abstract String getDescription();

	public abstract String getConnector();

	public TrainAbs getTrainAbs() {
		return trainAbs;
	}

}
