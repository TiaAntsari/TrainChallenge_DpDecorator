package ma.ensa.baseTrain;

public abstract class TrainAbs {
	protected String nom;
	protected String connector;

	// public abstract String addWagon();
	//
	// public abstract String detacheEnd();
	//
	// public abstract String detacheHead();

	public String getDescription() {
		return nom;
	}

	public String getConnector() {
		return connector;
	}
}
