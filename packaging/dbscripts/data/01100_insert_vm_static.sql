--
-- PostgreSQL database dump
--

-- Dumped from database version 10.6
-- Dumped by pg_dump version 10.6


--
-- Data for Name: vm_static; Type: TABLE DATA; Schema: public; Owner: engine
--

INSERT INTO vm_static (vm_guid, vm_name, mem_size_mb, vmt_guid, os, description, cluster_id, creation_date, num_of_monitors, is_initialized, is_auto_suspend, num_of_sockets, cpu_per_socket, usb_policy, time_zone, is_stateless, fail_back, _create_date, _update_date, dedicated_vm_for_vds, auto_startup, vm_type, nice_level, default_boot_sequence, default_display_type, priority, iso_path, origin, initrd_url, kernel_url, kernel_params, migration_support, userdefined_properties, predefined_properties, min_allocated_mem, entity_type, child_count, template_status, quota_id, allow_console_reconnect, cpu_pinning, is_smartcard_enabled, host_cpu_flags, db_generation, is_delete_protected, is_disabled, is_run_and_pause, created_by_user_id, tunnel_migration, free_text_comment, single_qxl_pci, cpu_shares, vnc_keyboard_layout, instance_type_id, image_type_id, sso_method, original_template_id, original_template_name, migration_downtime, template_version_number, template_version_name, serial_number_policy, custom_serial_number, is_boot_menu_enabled, numatune_mode, is_spice_file_transfer_enabled, is_spice_copy_paste_enabled, cpu_profile_id, is_auto_converge, is_migrate_compressed, custom_emulated_machine, custom_cpu_name, small_icon_id, large_icon_id, provider_id, num_of_io_threads, console_disconnect_action, threads_per_cpu, custom_compatibility_version, migration_policy_id) VALUES ('00000003-0003-0003-0003-0000000000be', 'Tiny', 512, '00000003-0003-0003-0003-0000000000be', 0, 'Tiny instance type', NULL, '2014-05-05 00:00:00+03', 1, NULL, false, 1, 1, 1, 'Etc/GMT', NULL, false, '2013-12-25 15:31:54.367179+02', '2013-12-25 15:31:53.239308+02', NULL, NULL, 0, 0, 0, 0, 0, '', 0, NULL, NULL, NULL, 0, NULL, NULL, 512, 'INSTANCE_TYPE', 0, 0, NULL, false, NULL, false, false, 1, false, false, false, NULL, NULL, NULL, false, 0, NULL, NULL, NULL, 'guest_agent', NULL, NULL, NULL, NULL, NULL, NULL, NULL, false, 'interleave', true, true, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, 1, NULL, NULL);
INSERT INTO vm_static (vm_guid, vm_name, mem_size_mb, vmt_guid, os, description, cluster_id, creation_date, num_of_monitors, is_initialized, is_auto_suspend, num_of_sockets, cpu_per_socket, usb_policy, time_zone, is_stateless, fail_back, _create_date, _update_date, dedicated_vm_for_vds, auto_startup, vm_type, nice_level, default_boot_sequence, default_display_type, priority, iso_path, origin, initrd_url, kernel_url, kernel_params, migration_support, userdefined_properties, predefined_properties, min_allocated_mem, entity_type, child_count, template_status, quota_id, allow_console_reconnect, cpu_pinning, is_smartcard_enabled, host_cpu_flags, db_generation, is_delete_protected, is_disabled, is_run_and_pause, created_by_user_id, tunnel_migration, free_text_comment, single_qxl_pci, cpu_shares, vnc_keyboard_layout, instance_type_id, image_type_id, sso_method, original_template_id, original_template_name, migration_downtime, template_version_number, template_version_name, serial_number_policy, custom_serial_number, is_boot_menu_enabled, numatune_mode, is_spice_file_transfer_enabled, is_spice_copy_paste_enabled, cpu_profile_id, is_auto_converge, is_migrate_compressed, custom_emulated_machine, custom_cpu_name, small_icon_id, large_icon_id, provider_id, num_of_io_threads, console_disconnect_action, threads_per_cpu, custom_compatibility_version, migration_policy_id) VALUES ('00000005-0005-0005-0005-0000000002e6', 'Small', 2048, '00000005-0005-0005-0005-0000000002e6', 0, 'Small instance type', NULL, '2014-05-05 00:00:00+03', 1, NULL, false, 1, 1, 1, 'Etc/GMT', NULL, false, '2013-12-25 15:31:54.367179+02', '2013-12-25 15:31:53.239308+02', NULL, NULL, 0, 0, 0, 0, 0, '', 0, NULL, NULL, NULL, 0, NULL, NULL, 2048, 'INSTANCE_TYPE', 0, 0, NULL, false, NULL, false, false, 1, false, false, false, NULL, NULL, NULL, false, 0, NULL, NULL, NULL, 'guest_agent', NULL, NULL, NULL, NULL, NULL, NULL, NULL, false, 'interleave', true, true, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, 1, NULL, NULL);
INSERT INTO vm_static (vm_guid, vm_name, mem_size_mb, vmt_guid, os, description, cluster_id, creation_date, num_of_monitors, is_initialized, is_auto_suspend, num_of_sockets, cpu_per_socket, usb_policy, time_zone, is_stateless, fail_back, _create_date, _update_date, dedicated_vm_for_vds, auto_startup, vm_type, nice_level, default_boot_sequence, default_display_type, priority, iso_path, origin, initrd_url, kernel_url, kernel_params, migration_support, userdefined_properties, predefined_properties, min_allocated_mem, entity_type, child_count, template_status, quota_id, allow_console_reconnect, cpu_pinning, is_smartcard_enabled, host_cpu_flags, db_generation, is_delete_protected, is_disabled, is_run_and_pause, created_by_user_id, tunnel_migration, free_text_comment, single_qxl_pci, cpu_shares, vnc_keyboard_layout, instance_type_id, image_type_id, sso_method, original_template_id, original_template_name, migration_downtime, template_version_number, template_version_name, serial_number_policy, custom_serial_number, is_boot_menu_enabled, numatune_mode, is_spice_file_transfer_enabled, is_spice_copy_paste_enabled, cpu_profile_id, is_auto_converge, is_migrate_compressed, custom_emulated_machine, custom_cpu_name, small_icon_id, large_icon_id, provider_id, num_of_io_threads, console_disconnect_action, threads_per_cpu, custom_compatibility_version, migration_policy_id) VALUES ('00000009-0009-0009-0009-0000000000f1', 'Large', 8192, '00000009-0009-0009-0009-0000000000f1', 0, 'Large instance type', NULL, '2014-05-05 00:00:00+03', 1, NULL, false, 2, 1, 1, 'Etc/GMT', NULL, false, '2013-12-25 15:31:54.367179+02', '2013-12-25 15:31:53.239308+02', NULL, NULL, 0, 0, 0, 0, 0, '', 0, NULL, NULL, NULL, 0, NULL, NULL, 8192, 'INSTANCE_TYPE', 0, 0, NULL, false, NULL, false, false, 1, false, false, false, NULL, NULL, NULL, false, 0, NULL, NULL, NULL, 'guest_agent', NULL, NULL, NULL, NULL, NULL, NULL, NULL, false, 'interleave', true, true, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, 1, NULL, NULL);
INSERT INTO vm_static (vm_guid, vm_name, mem_size_mb, vmt_guid, os, description, cluster_id, creation_date, num_of_monitors, is_initialized, is_auto_suspend, num_of_sockets, cpu_per_socket, usb_policy, time_zone, is_stateless, fail_back, _create_date, _update_date, dedicated_vm_for_vds, auto_startup, vm_type, nice_level, default_boot_sequence, default_display_type, priority, iso_path, origin, initrd_url, kernel_url, kernel_params, migration_support, userdefined_properties, predefined_properties, min_allocated_mem, entity_type, child_count, template_status, quota_id, allow_console_reconnect, cpu_pinning, is_smartcard_enabled, host_cpu_flags, db_generation, is_delete_protected, is_disabled, is_run_and_pause, created_by_user_id, tunnel_migration, free_text_comment, single_qxl_pci, cpu_shares, vnc_keyboard_layout, instance_type_id, image_type_id, sso_method, original_template_id, original_template_name, migration_downtime, template_version_number, template_version_name, serial_number_policy, custom_serial_number, is_boot_menu_enabled, numatune_mode, is_spice_file_transfer_enabled, is_spice_copy_paste_enabled, cpu_profile_id, is_auto_converge, is_migrate_compressed, custom_emulated_machine, custom_cpu_name, small_icon_id, large_icon_id, provider_id, num_of_io_threads, console_disconnect_action, threads_per_cpu, custom_compatibility_version, migration_policy_id) VALUES ('0000000b-000b-000b-000b-00000000021f', 'XLarge', 16384, '0000000b-000b-000b-000b-00000000021f', 0, 'Extra Large instance type', NULL, '2014-05-05 00:00:00+03', 1, NULL, false, 4, 1, 1, 'Etc/GMT', NULL, false, '2013-12-25 15:31:54.367179+02', '2013-12-25 15:31:53.239308+02', NULL, NULL, 0, 0, 0, 0, 0, '', 0, NULL, NULL, NULL, 0, NULL, NULL, 16384, 'INSTANCE_TYPE', 0, 0, NULL, false, NULL, false, false, 1, false, false, false, NULL, NULL, NULL, false, 0, NULL, NULL, NULL, 'guest_agent', NULL, NULL, NULL, NULL, NULL, NULL, NULL, false, 'interleave', true, true, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, 1, NULL, NULL);
INSERT INTO vm_static (vm_guid, vm_name, mem_size_mb, vmt_guid, os, description, cluster_id, creation_date, num_of_monitors, is_initialized, is_auto_suspend, num_of_sockets, cpu_per_socket, usb_policy, time_zone, is_stateless, fail_back, _create_date, _update_date, dedicated_vm_for_vds, auto_startup, vm_type, nice_level, default_boot_sequence, default_display_type, priority, iso_path, origin, initrd_url, kernel_url, kernel_params, migration_support, userdefined_properties, predefined_properties, min_allocated_mem, entity_type, child_count, template_status, quota_id, allow_console_reconnect, cpu_pinning, is_smartcard_enabled, host_cpu_flags, db_generation, is_delete_protected, is_disabled, is_run_and_pause, created_by_user_id, tunnel_migration, free_text_comment, single_qxl_pci, cpu_shares, vnc_keyboard_layout, instance_type_id, image_type_id, sso_method, original_template_id, original_template_name, migration_downtime, template_version_number, template_version_name, serial_number_policy, custom_serial_number, is_boot_menu_enabled, numatune_mode, is_spice_file_transfer_enabled, is_spice_copy_paste_enabled, cpu_profile_id, is_auto_converge, is_migrate_compressed, custom_emulated_machine, custom_cpu_name, small_icon_id, large_icon_id, provider_id, num_of_io_threads, console_disconnect_action, threads_per_cpu, custom_compatibility_version, migration_policy_id) VALUES ('00000007-0007-0007-0007-00000000010a', 'Medium', 4096, '00000007-0007-0007-0007-00000000010a', 0, 'Medium instance type', NULL, '2014-05-05 00:00:00+03', 1, NULL, false, 2, 1, 1, 'Etc/GMT', NULL, false, '2013-12-25 15:31:54.367179+02', '2013-12-25 15:31:53.239308+02', NULL, NULL, 0, 0, 0, 0, 0, '', 0, NULL, NULL, NULL, 0, NULL, NULL, 4096, 'INSTANCE_TYPE', 0, 0, NULL, false, NULL, false, false, 1, false, false, false, NULL, NULL, NULL, false, 0, NULL, NULL, NULL, 'guest_agent', NULL, NULL, NULL, NULL, NULL, NULL, NULL, false, 'interleave', true, true, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, 1, NULL, NULL);
INSERT INTO vm_static (vm_guid, vm_name, mem_size_mb, vmt_guid, os, description, cluster_id, creation_date, num_of_monitors, is_initialized, is_auto_suspend, num_of_sockets, cpu_per_socket, usb_policy, time_zone, is_stateless, fail_back, _create_date, _update_date, dedicated_vm_for_vds, auto_startup, vm_type, nice_level, default_boot_sequence, default_display_type, priority, iso_path, origin, initrd_url, kernel_url, kernel_params, migration_support, userdefined_properties, predefined_properties, min_allocated_mem, entity_type, child_count, template_status, quota_id, allow_console_reconnect, cpu_pinning, is_smartcard_enabled, host_cpu_flags, db_generation, is_delete_protected, is_disabled, is_run_and_pause, created_by_user_id, tunnel_migration, free_text_comment, single_qxl_pci, cpu_shares, vnc_keyboard_layout, instance_type_id, image_type_id, sso_method, original_template_id, original_template_name, migration_downtime, template_version_number, template_version_name, serial_number_policy, custom_serial_number, is_boot_menu_enabled, numatune_mode, is_spice_file_transfer_enabled, is_spice_copy_paste_enabled, cpu_profile_id, is_auto_converge, is_migrate_compressed, custom_emulated_machine, custom_cpu_name, small_icon_id, large_icon_id, provider_id, num_of_io_threads, console_disconnect_action, threads_per_cpu, custom_compatibility_version, migration_policy_id) VALUES ('00000000-0000-0000-0000-000000000000', 'Blank', 1024, '00000000-0000-0000-0000-000000000000', 0, 'Blank template', NULL, '2008-04-01 00:00:00+03', 1, NULL, false, 1, 1, 1, NULL, NULL, false, '2013-12-25 15:31:54.367179+02', '2013-12-25 15:31:53.239308+02', NULL, NULL, 0, 0, 0, 1, 0, '', 3, NULL, NULL, NULL, 0, NULL, NULL, 1024, 'TEMPLATE', 0, 0, NULL, false, NULL, false, false, 1, false, false, false, NULL, NULL, NULL, false, 0, NULL, NULL, NULL, 'guest_agent', NULL, NULL, NULL, NULL, NULL, NULL, NULL, false, 'interleave', true, true, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, 1, NULL, NULL);


--
-- PostgreSQL database dump complete
--

