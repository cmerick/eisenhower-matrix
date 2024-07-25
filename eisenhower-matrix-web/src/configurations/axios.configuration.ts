import axios from 'axios';
import { KEYCLOAK_URL } from '@configurations/keycloak-configuration.ts';

const API_SERVER_URL =
	import.meta.env.VITE_API_REST_URL ?? 'http://localhost:5433';

/*
const paramSerializer = (params: Record<string, unknown>) => {
  const nParams: Record<string, unknown> = {};

  Object.entries(params).forEach(([key, value]) => {
    if (value instanceof Date) {
      nParams[key] = moment(value).utcOffset(0, true).format();
    } else {
      nParams[key] = value;
    }
  });

  return qs.stringify(nParams, { arrayFormat: 'brackets' });
};

const apiRest = axios.create({
  baseURL: API_SERVER_URL,
  paramsSerializer: {
    serialize: paramSerializer,
  },
});


const apiKeycloak = axios.create({
  baseURL: KEYCLOAK_URL,
  paramsSerializer: {
    serialize: paramSerializer,
  },
});
*/

const apiRest = axios.create({
	baseURL: API_SERVER_URL,
});

const apiKeycloak = axios.create({
	baseURL: KEYCLOAK_URL,
});

export { apiRest, apiKeycloak };
