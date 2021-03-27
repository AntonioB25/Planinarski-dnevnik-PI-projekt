import { Cabin } from "./Cabin";
import { UserDetails } from "./UserDetails";

export interface Trip {
  id: bigint;
  duration: number;
  difficulty: string;
  description: string;
  peak: string;
  area: string;
  length: string;
  rate: number;
  user: UserDetails;
  cabins: Cabin[];
}
