/************************************************************************
 * This file is part of AdminCmd.									
 *																		
 * AdminCmd is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by	
 * the Free Software Foundation, either version 3 of the License, or		
 * (at your option) any later version.									
 *																		
 * AdminCmd is distributed in the hope that it will be useful,	
 * but WITHOUT ANY WARRANTY; without even the implied warranty of		
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the			
 * GNU General Public License for more details.							
 *																		
 * You should have received a copy of the GNU General Public License
 * along with AdminCmd.  If not, see <http://www.gnu.org/licenses/>.
 ************************************************************************/
package com.zone.vchest.tools.config;

import org.bukkit.configuration.ConfigurationOptions;

/**
 * @author Balor (aka Antoine Aflalo)
 * 
 */
public class ExMemoryConfigurationOption extends ConfigurationOptions {

	protected ExMemoryConfigurationOption(ExMemoryConfiguration configuration) {
		super(configuration);
	}

	@Override
	public ExMemoryConfiguration configuration() {
		return (ExMemoryConfiguration) super.configuration();
	}

	@Override
	public ExMemoryConfigurationOption copyDefaults(boolean value) {
		super.copyDefaults(value);
		return this;
	}

	@Override
	public ExMemoryConfigurationOption pathSeparator(char value) {
		super.pathSeparator(value);
		return this;
	}

}
