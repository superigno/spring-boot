package com.pc.globalpos.ratefeed.model;

/**
 * @author gino.q
 * @date April 8, 2020
 *
 */
public final class ApplicationProperties {

	private final String mailFrom;
	private final String mailTo;
	private final String mailSubject;

	private final String baseDir;
	private final String[] outputDirs;

	private final String sourceName;
	private final String sourceUrl;
	private final String sourceType;

	private final String filenameFormat;

	private final int runTimeIntervalInMinute;

	private final int retryLimit;
	private final int retryIntervalInMinute;

	private final String baseCurrency;

	private ApplicationProperties(String mailFrom, String mailTo, String mailSubject, String baseDir, String[] outputDirs, String sourceName,
			String sourceUrl, String sourceType, String filenameFormat, int runTimeIntervalInMinute,
			int retryLimit, int retryIntervalInMinute, String baseCurrency) {
		this.mailFrom = mailFrom;
		this.mailTo = mailTo;
		this.mailSubject = mailSubject;
		this.baseDir = baseDir;
		this.outputDirs = outputDirs;
		this.sourceName = sourceName;
		this.sourceUrl = sourceUrl;
		this.sourceType = sourceType;
		this.filenameFormat = filenameFormat;
		this.runTimeIntervalInMinute = runTimeIntervalInMinute;
		this.retryLimit = retryLimit;
		this.retryIntervalInMinute = retryIntervalInMinute;
		this.baseCurrency = baseCurrency;
	}

	public String getMailFrom() {
		return mailFrom;
	}

	public String getMailTo() {
		return mailTo;
	}
	
	public String getMailSubject() {
		return mailSubject;
	}

	public String getBaseDir() {
		return baseDir;
	}

	public String[] getOutputDirs() {
		return outputDirs;
	}

	public String getSourceName() {
		return sourceName;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public String getSourceType() {
		return sourceType;
	}

	public String getFilenameFormat() {
		return filenameFormat;
	}

	public int getRunTimeIntervalInMinute() {
		return runTimeIntervalInMinute;
	}

	public int getRetryLimit() {
		return retryLimit;
	}

	public int getRetryIntervalInMinute() {
		return retryIntervalInMinute;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public static class Builder {
		private String mailFrom;
		private String mailTo;
		private String mailSubject;

		private String baseDir;
		private String[] outputDirs;

		private String sourceName;
		private String sourceUrl;
		private String sourceType;

		private String filenameFormat;

		private int runTimeIntervalInMinute;

		private int retryLimit;
		private int retryIntervalInMinute;

		private String baseCurrency;

		public Builder setMailFrom(String mailFrom) {
			this.mailFrom = mailFrom;
			return this;
		}

		public Builder setMailTo(String mailTo) {
			this.mailTo = mailTo;
			return this;
		}
		
		public Builder setMailSubject(String mailSubject) {
			this.mailSubject = mailSubject;
			return this;
		}

		public Builder setBaseDir(String baseDir) {
			this.baseDir = baseDir;
			return this;
		}

		public Builder setOutputDirs(String[] outputDirs) {
			this.outputDirs = outputDirs;
			return this;
		}

		public Builder setSourceName(String sourceName) {
			this.sourceName = sourceName;
			return this;
		}

		public Builder setSourceUrl(String sourceUrl) {
			this.sourceUrl = sourceUrl;
			return this;
		}

		public Builder setSourceType(String sourceType) {
			this.sourceType = sourceType;
			return this;
		}
		
		public Builder setFilenameFormat(String filenameFormat) {
			this.filenameFormat = filenameFormat;
			return this;
		}

		public Builder setRunTimeIntervalInMinute(int runTimeIntervalInMinute) {
			this.runTimeIntervalInMinute = runTimeIntervalInMinute;
			return this;
		}

		public Builder setRetryLimit(int retryLimit) {
			this.retryLimit = retryLimit;
			return this;
		}

		public Builder setRetryIntervalInMinute(int retryIntervalInMinute) {
			this.retryIntervalInMinute = retryIntervalInMinute;
			return this;
		}

		public Builder setBaseCurrency(String baseCurrency) {
			this.baseCurrency = baseCurrency;
			return this;
		}

		public ApplicationProperties build() {
			return new ApplicationProperties(mailFrom, mailTo, mailSubject, baseDir, outputDirs, sourceName, sourceUrl, sourceType,
					 filenameFormat, runTimeIntervalInMinute, retryLimit, retryIntervalInMinute, baseCurrency);
		}

	}

}
