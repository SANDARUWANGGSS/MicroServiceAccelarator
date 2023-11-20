package com.microService.employeservice.service;

import com.microService.employeservice.dto.ApiResponseDto;
import com.microService.employeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    ApiResponseDto getEmployeeById(Long id);
}
