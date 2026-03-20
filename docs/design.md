# Apartment Management System - Design Document

## Overview
This system manages apartment residents and tracks apartment occupancy efficiently using Object-Oriented Programming concepts.

## Classes Used
Resident, Tenant, Owner, Apartment, Main, ApartmentGui

## Relationships
Tenant and Owner inherit from Resident.
Each Resident is associated with an Apartment using apartment number.

## OOP Concepts
Encapsulation is used to protect data.
Inheritance is used for Tenant and Owner.
Polymorphism is applied in method overriding.
Abstraction simplifies system design.
Exception Handling manages invalid operations.

## Data Handling
ArrayList is used to store resident data temporarily during execution.

## Future Improvements
Add database for permanent storage.
Improve GUI with better design.
Add search and filtering features.