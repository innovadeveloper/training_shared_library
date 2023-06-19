package com.models

import com.models.Project
import com.models.ProjectInfo

class ConfigurationTool {
    String build
    String path
}



class Credentials {
    String credentials_id
}

class RepositoryInfo {
    String repository_server_type
    String environment_type
    String registry_image
    String registry_credentials_id
}

class ServicePort {
    String protocol
    int port
    int targetPort
    int nodePort
}

class EnvironmentVariable {
    String name
    String value
}

class ResourcesPlan {
    String max_memory_usage
    String min_memory_usage
    String min_cpu_usage
    String max_cpu_usage
}

class Storage {
    String volume_size
    List<String> mount_path
}

class Service {
    List<ServicePort> ports
}

class Replicas {
    int min
    int max
}

class JenkinsProperty {
    Storage storage
    Service service
    List<EnvironmentVariable> enviroment_variables
    ResourcesPlan resources_plan
    Project project
    Replicas replicas
}