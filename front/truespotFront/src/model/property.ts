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
import { Xml } from './xml';


export interface Property {
    readOnly?: boolean;
    type?: string;
    format?: string;
    position?: number;
    description?: string;
    title?: string;
    vendorExtensions?: { [key: string]: any; };
    allowEmptyValue?: boolean;
    example?: any;
    xml?: Xml;
}
