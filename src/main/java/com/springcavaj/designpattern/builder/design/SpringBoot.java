/**
 * 
 */
package com.springcavaj.designpattern.builder.design;

/**
 * 
 * @author springcavaj
 */
public class SpringBoot {
	
	private String annotationController;
	private String annotationService;
	private String annotationRepository;
	private String annotationEntity;
	private Boolean isDIEnabled;
	private Boolean isIOCEnabled;
	
	
	private SpringBoot(SpringBootBuilder springBootBuilder) {
		super();
		this.annotationController = springBootBuilder.annotationController;
		this.annotationService = springBootBuilder.annotationService;
		this.annotationRepository = springBootBuilder.annotationRepository;
		this.annotationEntity = springBootBuilder.annotationEntity;
		this.isDIEnabled = springBootBuilder.isDIEnabled;
		this.isIOCEnabled = springBootBuilder.isIOCEnabled;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SpringBoot [annotationController=");
		builder.append(annotationController);
		builder.append(", annotationService=");
		builder.append(annotationService);
		builder.append(", annotationRepository=");
		builder.append(annotationRepository);
		builder.append(", annotationEntity=");
		builder.append(annotationEntity);
		builder.append(", isDIEnabled=");
		builder.append(isDIEnabled);
		builder.append(", isIOCEnabled=");
		builder.append(isIOCEnabled);
		builder.append("]");
		return builder.toString();
	}

	public static class SpringBootBuilder {
		
		private String annotationController;
		private String annotationService;
		private String annotationRepository;
		private String annotationEntity;
		private Boolean isDIEnabled;
		private Boolean isIOCEnabled;
		
		public SpringBootBuilder(String annotationController, String annotationRepository, String annotationEntity) {
			super();
			this.annotationController = annotationController;
			this.annotationRepository = annotationRepository;
			this.annotationEntity = annotationEntity;
		}
		
		public SpringBootBuilder setAnnotationService(String annotationService) {
			this.annotationService = annotationService;
			return this;
		}
		
		public SpringBootBuilder setDIEnabled(Boolean isDIEnabled) {
			this.isDIEnabled = isDIEnabled;
			return this;
		}
		
		public SpringBootBuilder setIOCEnabled(Boolean isIOCEnabled) {
			this.isIOCEnabled = isIOCEnabled;
			return this;
		}
		
		public SpringBoot build() {
			return new SpringBoot(this);
		}
		
	}
}
