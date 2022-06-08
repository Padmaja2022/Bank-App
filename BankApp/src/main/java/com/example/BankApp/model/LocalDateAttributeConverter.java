package com.example.BankApp.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)

public class LocalDateAttributeConverter implements AttributeConverter<LocalDate, Date> {

	@Override
	public Date convertToDatabaseColumn(LocalDate attribute) {
		// TODO Auto-generated method stub

		if (attribute != null) {
			
			return Date.valueOf(attribute);
			
		} else {
			
			return null;
		}
	}

	@Override
	public LocalDate convertToEntityAttribute(Date dbData) {
		// TODO Auto-generated method stub
		if (dbData != null) {
			
			return dbData.toLocalDate();
			
		} else {
			
			return null;
			
		}

	}

}
