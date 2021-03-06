/**
 * Swagger Maven Plugin Sample
 * This is a sample.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
import {Role} from './role';


export interface User {
    id?: number;
    roles?: Array<Role>;
    firstName?: string;
    lastName?: string;
    birthDate?: Date;
    gender?: string;
    pseudo?: string;
    password?: string;
    email?: string;
    phoneNumber?: string;
}
